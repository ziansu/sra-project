public static void main(java.lang.String[] args) {
    java.util.Scanner scanIn = new java.util.Scanner(java.lang.System.in);
    long n;
    java.lang.System.out.print("Nhap so n: ");
    n = scanIn.nextInt();
    java.lang.System.out.print(((("Tong cac so chan nho hon " + n) + " la:") + (tinhtongdemo.TinhTongDemo.TinhTong(n))));
}