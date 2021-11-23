static java.math.BigInteger xorFold(java.math.BigInteger inp, int k) {
    java.math.BigInteger andme = new java.math.BigInteger("2").pow(k).add(new java.math.BigInteger("-1"));
    return inp.xor(inp.shiftRight(k)).and(andme);
}