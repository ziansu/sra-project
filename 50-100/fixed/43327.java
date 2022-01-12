private char nextChar() {
    if (EOF)
        return 0;
    
    (pos)++;
    if ((pos) >= ((chars.length) - 1))
        EOF = true;
    
    if ((pos) >= (chars.length))
        return 0;
    
    char retVal = chars[pos];
    if (!(java.lang.Character.isWhitespace(retVal)))
        lastNonWhitespace = retVal;
    
    return retVal;
}