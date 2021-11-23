public static java.lang.String getCnASCII(java.lang.String cnStr) {
    java.lang.StringBuilder strBuf = new java.lang.StringBuilder();
    byte[] bGBK = cnStr.getBytes();
    for (int i = 0; i < (bGBK.length); i++) {
        strBuf.append(java.lang.Integer.toHexString(((bGBK[i]) & 255)));
    }
    return strBuf.toString();
}