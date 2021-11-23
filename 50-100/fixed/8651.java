private boolean isKeyWords(char ch) {
    if (((ch == '<') || (ch == '>')) || (ch == '?')) {
        return true;
    }else
        if (ch == '=') {
            return ((peekChar()) == '"') || ((peekChar()) == '\'');
        }else {
            return (ch == '/') && ((peekChar()) == '>');
        }
    
}