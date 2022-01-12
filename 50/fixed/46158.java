public void number() throws java.lang.Exception {
    if (accept(Token.number)) {
        next();
    }else {
        error("Missing number");
    }
}