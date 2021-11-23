protected void decryptBuffer(java.nio.ByteBuffer out) throws java.io.IOException {
    int inputSize = inBuffer.remaining();
    try {
        int n = cipher.update(inBuffer, out);
        if (n < inputSize) {
            cipher.doFinal(inBuffer, out);
            cipherReset = true;
        }
    } catch (javax.crypto.ShortBufferException | javax.crypto.IllegalBlockSizeException | javax.crypto.BadPaddingException e) {
        throw new java.io.IOException(e);
    }
}