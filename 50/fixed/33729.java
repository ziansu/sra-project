private static int gcd(int a, int b) {
    return java.math.BigInteger.valueOf(java.lang.Math.abs(a)).gcd(java.math.BigInteger.valueOf(java.lang.Math.abs(b))).intValue();
}