protected java.lang.String byteArrayToHexString(byte[] bytes) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder(((bytes.length) * 2));
    for (byte element : bytes) {
        int v = element & 255;
        if (v < 16) {
            sb.append('0');
        }
        sb.append(java.lang.Integer.toHexString(v));
    }
    return sb.toString().toUpperCase(java.util.Locale.US);
}