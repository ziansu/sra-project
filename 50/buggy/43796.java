public static boolean checkExpon(java.math.BigInteger x) {
    return !(((x.compareTo(java.math.BigInteger.ONE)) > 0) && ((x.compareTo(net.java.otr4j.crypto.SM.ORDER_S)) <= 0));
}