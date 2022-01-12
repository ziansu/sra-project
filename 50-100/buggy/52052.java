public void formalParam() throws java.lang.Exception {
    if (accept(Token.openparenToken)) {
        next();
        while (!(accept(Token.closeparenToken))) {
            ident();
            if (accept(Token.commaToken)) {
                next();
            }
        } 
        if (accept(Token.closeparenToken)) {
            next();
        }else {
            throw new java.lang.Exception("Missing close paren for formal params");
        }
    }else {
        throw new java.lang.Exception("Missing open paren for formal params");
    }
}