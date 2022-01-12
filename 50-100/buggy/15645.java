public void typeDecl() throws java.lang.Exception {
    if ((accept(Token.varToken)) || (accept(Token.arrToken))) {
        next();
        while (accept(Token.openbracketToken)) {
            next();
            number();
            if (accept(Token.closebracketToken)) {
                next();
            }else {
                throw new java.lang.Exception("Missing close parenthesis in type declaration");
            }
        } 
    }
}