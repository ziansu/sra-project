public static boolean isPandigital(long num, int n) {
    java.util.Set<java.lang.Integer> digits = new java.util.HashSet<>(be.inniger.euler.util.Maths.getDigits(num));
    return ((digits.size()) == n) && ((java.util.stream.IntStream.rangeClosed(1, n).filter(digits::contains).count()) == n);
}