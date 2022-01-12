public org.ethereum.net.rlpx.AuthInitiateMessage decryptAuthInitiate(final byte[] ciphertext, final org.ethereum.crypto.ECKey myKey) throws org.spongycastle.crypto.InvalidCipherTextException {
    try {
        final byte[] plaintext = org.ethereum.crypto.ECIESCoder.decrypt(myKey.getPrivKey(), ciphertext);
        return org.ethereum.net.rlpx.AuthInitiateMessage.decode(plaintext);
    } catch (final java.io.IOException e) {
        throw com.google.common.base.Throwables.propagate(e);
    }
}