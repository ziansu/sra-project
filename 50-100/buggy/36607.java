public static java.math.BigInteger factorial(java.math.BigInteger n) {
    java.math.BigInteger result = java.math.BigInteger.ONE;
    while ((n.equals(java.math.BigInteger.ZERO)) == false) {
        result = result.multiply(n);
        n = n.subtract(java.math.BigInteger.ONE);
    } 
    return result;
}