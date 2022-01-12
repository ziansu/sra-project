public static java.lang.String readHeaderString(byte[] buffer) {
    int i = 0;
    while ((i < (buffer.length)) && (!(webserver.ParseTools.endOfHeader(buffer, (i - 1))))) {
        i++;
    } 
    return new java.lang.String(buffer, 0, i);
}