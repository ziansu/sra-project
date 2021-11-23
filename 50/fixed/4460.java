private boolean verify(java.lang.String signature, java.lang.String timestamp, java.lang.String nonce, java.lang.String msg) {
    return signature.equals(sign(timestamp, nonce, msg));
}