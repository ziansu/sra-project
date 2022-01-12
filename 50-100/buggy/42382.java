public void funcCall() throws java.lang.Exception {
    if (accept(Token.callToken)) {
        next();
        ident();
        if (accept(Token.openparenToken)) {
            next();
            expression();
            while (accept(Token.commaToken)) {
                next();
                expression();
            } 
            if (accept(Token.closeparenToken)) {
                next();
            }else {
                throw new java.lang.Exception("Missing close paren in func call");
            }
        }else {
            throw new java.lang.Exception("Missing open paren in func call");
        }
    }
}