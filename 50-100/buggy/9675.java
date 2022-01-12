public boolean isLookaheadIgnoreWhitespace(char expectedChar) {
    int tempPos = (pos) + 1;
    if ((tempPos + 1) >= (input.length()))
        return false;
    
    char c = input.charAt(tempPos);
    while (isWhitespace()) {
        ++tempPos;
        if (tempPos >= (input.length()))
            return false;
        
        c = input.charAt(tempPos);
    } 
    return c == expectedChar;
}