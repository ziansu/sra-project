public static java.lang.String intToOctalString(int i) {
    int bufLen = 11;
    char[] buf = new char[bufLen];
    int cursor = bufLen;
    do {
        buf[(--cursor)] = java.lang.Integer.DIGITS[(i & 7)];
    } while ((i >>>= 3) != 0 );
    return new java.lang.String(buf, cursor, (bufLen - cursor));
}