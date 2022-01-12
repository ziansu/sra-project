protected java.lang.String random() {
    java.lang.String s = new java.math.BigInteger(((length) * 5), random).toString(36);
    if ((s.length()) > (length)) {
        return s.substring(0, length);
    }
    return s;
}