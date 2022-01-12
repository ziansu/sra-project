private int charCode(char c) {
    if (java.lang.Character.isLetter(c)) {
        return (c - 'A') + 1;
    }
    if (c == '[')
        return 27;
    
    if (c == '\\')
        return 28;
    
    if (c == ']')
        return 29;
    
    if (c == '^')
        return 30;
    
    if (c == '_')
        return 31;
    
    throw new java.lang.RuntimeException(("error char: " + c));
}