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
            error("Misisng closing bracket for func body");
        }
    }else {
        error("Missing open bracket for func body");
    }
}