public static java.lang.String zeroPaddedHex(long k, int pad) {
    java.lang.String hexStr = java.lang.Long.toHexString(k);
    int nZeroes = pad - (hexStr.length());
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for (int i = 0; i < nZeroes; i++)
        sb.append("0");
    
    sb.append(hexStr);
    return sb.toString();
}