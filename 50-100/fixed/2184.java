public java.lang.String toStringMongod() {
    byte[] b = toByteArray();
    java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder(24);
    for (int i = 0; i < (b.length); i++) {
        int x = (b[i]) & 255;
        java.lang.String s = java.lang.Integer.toHexString(x);
        if ((s.length()) == 1)
            stringBuilder.append("0");
        
        stringBuilder.append(s);
    }
    return stringBuilder.toString();
}