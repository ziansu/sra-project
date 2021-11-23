public static java.math.BigInteger sqrt(java.math.BigInteger x) {
    java.math.BigInteger div = java.math.BigInteger.ZERO.setBit(((x.bitLength()) / 2));
    java.math.BigInteger div2 = div;
    for (; ;) {
        java.math.BigInteger y = div.add(x.divide(div)).shiftRight(1);
        if ((y.equals(div)) || (y.equals(div2)))
            return y;
        
        div2 = div;
        div = y;
    }
}