public void varDecl() throws java.lang.Exception {
    typeDecl();
    ident();
    while (accept(Token.commaToken)) {
        next();
        ident();
    } 
    if (accept(Token.semiToken)) {
        next();
    }else {
        throw new java.lang.Exception("Missing semicolon for var declaration");
    }
}