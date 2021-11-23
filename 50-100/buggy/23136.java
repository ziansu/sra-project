private java.lang.String zeroPaddedHex(int k, int pad) {
    java.lang.String hexStr = java.lang.Integer.toHexString(k);
    int nonHex = java.lang.Integer.parseInt(hexStr.substring(2));
    int nZeroes = pad - (hexStr.length());
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for (int i = 0; i < nZeroes; i++)
        sb.append("0");
    
    sb.append(nonHex);
    return sb.toString();
}