public static java.lang.String getCnASCII(java.lang.String cnStr) {
    java.lang.StringBuffer strBuf = new java.lang.StringBuffer();
    byte[] bGBK = cnStr.getBytes();
    for (int i = 0; i < (bGBK.length); i++) {
        strBuf.append(java.lang.Integer.toHexString(((bGBK[i]) & 255)));
    }
    return strBuf.toString();
}