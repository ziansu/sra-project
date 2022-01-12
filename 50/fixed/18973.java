public void ident() throws java.lang.Exception {
    if (accept(Token.ident)) {
        next();
    }else {
        error("Missing identifier");
    }
}