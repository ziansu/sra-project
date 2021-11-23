private int getCharAfterS() throws com.ximpleware.EOFException, com.ximpleware.EncodingException, com.ximpleware.ParseException {
    int n;
    int k;
    n = r.getChar();
    while ((((n == ' ') || (n == '\t')) || (n == '\n')) || (n == '\r')) {
        n = r.getChar();
    } 
    return n;
}