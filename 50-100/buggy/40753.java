public java.lang.String readString(int l) {
    if (l == (-1))
        return null;
    
    if (l == 0)
        return "";
    
    if (l < (-1))
        throw new java.lang.IllegalArgumentException(("invalid string length: " + l));
    
    char[] ca = new char[l];
    int i = 0;
    while (i < l) {
        ca[l] = readChar();
        i += 1;
    } 
    return new java.lang.String(ca);
}