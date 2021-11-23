public void ident() throws java.lang.Exception {
    if (accept(Token.ident)) {
        next();
    }else {
        throw new java.lang.Exception("Missing identifier");
    }
}