public static int computeDigitalRoot(int n) {
    return n == 0 ? 0 : (n % 9) == 0 ? 9 : n % 9;
}