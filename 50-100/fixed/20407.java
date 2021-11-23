public static java.lang.String intToHexString(int i, int minWidth) {
    int bufLen = 8;
    char[] buf = new char[bufLen];
    int cursor = bufLen;
    char[] digits = java.lang.Integer.DIGITS;
    do {
        buf[(--cursor)] = digits[(i & 15)];
    } while (((i >>>= 4) != 0) || ((bufLen - cursor) < minWidth) );
    return new java.lang.String(buf, cursor, (bufLen - cursor));
}