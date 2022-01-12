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
                throw new java.lang.Exception("Missing od token");
            }
        }else {
            throw new java.lang.Exception("Missing do token");
        }
    }else {
        throw new java.lang.Exception("Missing while token");
    }
}