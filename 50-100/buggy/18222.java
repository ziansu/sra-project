public static android.support.v4.util.Pair<byte[], byte[]> genKeyPairBytes(int keyBitSize) {
    java.security.KeyPair keyPair = core.mate.util.crypto.RSACrypto.genKeyPair();
    java.security.Key privateKey = keyPair.getPrivate();
    java.security.Key publicKey = keyPair.getPublic();
    return android.support.v4.util.Pair.create(privateKey.getEncoded(), publicKey.getEncoded());
}