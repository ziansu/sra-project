public int convert(int n, int b) {
    int remainder = 0;
    if (n == 1) {
        remainder = n;
        java.lang.System.out.print(remainder);
        return remainder;
    }else {
        remainder = n % b;
        n = n / b;
        java.lang.System.out.print(remainder);
        convert(n, b);
        return remainder;
    }
}