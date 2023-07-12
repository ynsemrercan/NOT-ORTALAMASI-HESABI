import java.util.Scanner;

public class NOT_ORT_HESABİ {
    public static void main(String[] args) {

        int mat,turkce,fiz,kim,music,tarih;
        double ort;
        int baraj=60;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz: ");
        mat= input.nextInt();

        System.out.print("Türçe Notunuzu Giriniz: ");
        turkce= input.nextInt();

        System.out.print("Fizik Notunuzu Giriniz: ");
        fiz= input.nextInt();

        System.out.print("Kimya Notunuzu Giriniz: ");
        kim= input.nextInt();

        System.out.print("Müzik Notunuzu Giriniz: ");
        music= input.nextInt();

        System.out.print("Tarih Notunuzu Giriniz: ");
        tarih= input.nextInt();


        ort = (mat + turkce + fiz + kim + music + tarih)/6;


        System.out.println("Ortalamız : "+ort );


        boolean sonuc = ort > baraj;

        String str = sonuc ? "TEBRİKLER Sınıfı Geçtiniz :) " : "MAALESEF Sınıfda Kaldınız :( ";
        System.out.print(str);








    }
}
