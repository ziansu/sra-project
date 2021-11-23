private static java.lang.String intToBinaryString(int i) {
    int bufLen = 32;
    char[] buf = new char[bufLen];
    int cursor = bufLen;
    do {
        buf[(--cursor)] = java.lang.Integer.DIGITS[(i & 1)];
    } while ((i >>>= 1) != 0 );
    return new java.lang.String(cursor, (bufLen - cursor), buf);
}