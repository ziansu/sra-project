private int expr() throws java.lang.Exception {
    if ((_position) >= (_len))
        return 0;
    
    if ((altn()) > 0)
        throw new java.lang.Exception((("Syntax Error: did not find expected symbol after '" + (_text.substring(0, _position))) + "'"));
    
    if ((_position) >= (_len))
        return 0;
    
    if ((checkNext()) == '|') {
        (_position)++;
        expr();
    }
    return 0;
}