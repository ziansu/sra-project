public static final net.blackhacker.crypto.SK getInstanceAES128WithOFB(byte[] iv) throws net.blackhacker.crypto.CryptoException {
    return net.blackhacker.crypto.SK.getInstanceAES128WithOFB(iv, RANDOM_128_BITS());
}