public static void main(java.lang.String[] args) {
    java.util.Scanner scan = new java.util.Scanner(java.lang.System.in);
    int N = scan.nextInt();
    long r = scan.nextInt();
    long c = scan.nextInt();
    long base = 0;
    long result = Main.getPoint((r + 1), (c + 1), N, base);
    java.lang.System.out.println((result - 1));
}