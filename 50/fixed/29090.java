public static void main(java.lang.String[] args) {
    exercise2.Exercise2 ex2 = new exercise2.Exercise2();
    long count = ex2.segmentedSieve(java.lang.Integer.MAX_VALUE, 32768, false);
    java.lang.System.out.println((("Found " + count) + " primes."));
}