private org.bouncycastle.crypto.params.KeyParameter computeEncryptionKey(byte[] blockBytes) {
    byte[] encKey = cryptDeriveKey(_baseHash, blockBytes, _encKeyByteSize);
    return new org.bouncycastle.crypto.params.KeyParameter(encKey);
}