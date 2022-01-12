private java.lang.String publicKeyToString() {
    java.lang.StringBuilder buffer = new java.lang.StringBuilder();
    for (byte b : publicKey) {
        buffer.append(b);
    }
    return buffer.toString();
}