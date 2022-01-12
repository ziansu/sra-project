public boolean verify(java.math.BigInteger publicKey, java.math.BigInteger message, java.math.BigInteger signature) {
    sha_256.update(message.toByteArray());
    byte[] h = sha_256.digest();
    java.math.BigInteger hash = new java.math.BigInteger(1, h);
    return decrypt(publicKey, signature).equals(hash);
}