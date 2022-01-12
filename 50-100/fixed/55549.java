private static int generateRandomNonce(final byte[] nonceBuffer, final int offset, final int size) {
    final java.security.SecureRandom rng = new java.security.SecureRandom();
    final byte[] nonce = new byte[size];
    rng.nextBytes(nonce);
    java.lang.System.arraycopy(nonce, 0, nonceBuffer, offset, size);
    return offset + size;
}