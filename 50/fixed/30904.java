public static boolean checkGroupElem(java.math.BigInteger g) {
    return ((g.compareTo(java.math.BigInteger.valueOf(2))) < 0) || ((g.compareTo(net.java.otr4j.crypto.SM.MODULUS_MINUS_2)) > 0);
}