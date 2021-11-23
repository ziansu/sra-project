public void returnStatement() throws java.lang.Exception {
    if (accept(Token.returnToken)) {
        next();
        expression();
    }else {
        error("Missing return statement");
    }
}