public static java.lang.String printBytes(byte[] buffer, int start, int length) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder((length - start));
    for (int i = start; i < (start + length); i++) {
        sb.append(java.lang.String.format("%%%02x", buffer[i]));
    }
    return sb.toString();
}