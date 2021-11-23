public static final net.blackhacker.crypto.SK getInstanceAES128WithCFB(final byte[] iv) throws net.blackhacker.crypto.CryptoException {
    return net.blackhacker.crypto.SK.getInstanceAES128WithCFB(iv, RANDOM_128_BITS());
}