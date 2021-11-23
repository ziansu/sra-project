private int getCharAfterS() throws com.ximpleware.EOFException, com.ximpleware.EncodingException, com.ximpleware.ParseException {
    int n;
    while (true) {
        n = r.getChar();
        if ((((n == ' ') || (n == '\t')) || (n == '\n')) || (n == '\r')) {
        }else
            return n;
        
    } 
}