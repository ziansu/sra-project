public void funcBody() throws java.lang.Exception {
    if (accept(Token.varToken)) {
        varDecl();
    }
    if (accept(Token.beginToken)) {
        next();
        statSequence();
        if (accept(Token.endToken)) {
            next();
        }else {
            throw new java.lang.Exception("Misisng closing bracket for func body");
        }
    }else {
        throw new java.lang.Exception("Missing open bracket for func body");
    }
}