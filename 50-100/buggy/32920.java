private boolean isBooleanLiteral(java.lang.StringBuffer str) {
    boolean out = true;
    if (str.toString().equals("true")) {
        tokens.add(symbol(JParserSym.BOOLEAN_LITERAL, new java.lang.Boolean(true)));
    }else
        if (str.toString().equals("false")) {
            tokens.add(symbol(JParserSym.BOOLEAN_LITERAL, new java.lang.Boolean(true)));
        }else {
            out = false;
        }
    
    return out;
}