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
            error("Missing close paren for formal params");
        }
    }else {
        error("Missing open paren for formal params");
    }
}