private char nextChar() {
    if (EOF) {
        return ' ';
    }
    (pos)++;
    char retVal;
    if ((pos) < (chars.length)) {
        retVal = chars[pos];
        if (!(java.lang.Character.isWhitespace(retVal)))
            lastNonWhitespace = retVal;
        
    }else {
        retVal = ' ';
    }
    if ((pos) == ((chars.length) - 1)) {
        EOF = true;
    }
    return retVal;
}