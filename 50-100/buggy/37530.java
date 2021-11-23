protected void nextLess() {
    source.nextChar();
    if ((source.getChar()) == '>') {
        token = lessGreaterToken;
        source.nextChar();
    }else
        if ((source.getChar()) == '=') {
            token = lessEqualToken;
            source.nextChar();
        }else {
            token = lessToken;
        }
    
}