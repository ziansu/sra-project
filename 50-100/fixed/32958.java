public void whileStatement() throws java.lang.Exception {
    if (accept(Token.whileToken)) {
        next();
        relation();
        if (accept(Token.doToken)) {
            next();
            statSequence();
            if (accept(Token.odToken)) {
                next();
            }else {
                error("Missing od token");
            }
        }else {
            error("Missing do token");
        }
    }else {
        error("Missing while token");
    }
}