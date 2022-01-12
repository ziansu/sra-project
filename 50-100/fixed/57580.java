public java.lang.String encode(byte[] src, int srcOffs, int srcSize) {
    try {
        java.lang.StringBuffer sb = new java.lang.StringBuffer(getEncodedSize(srcSize));
        encode(src, srcOffs, srcSize, sb);
        return sb.toString();
    } catch (java.io.IOException e) {
        return null;
    }
}