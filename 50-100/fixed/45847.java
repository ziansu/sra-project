public void assignment() throws java.lang.Exception {
    if (accept(Token.letToken)) {
        next();
        designator();
        if (accept(Token.becomesToken)) {
            next();
            expression();
        }else {
            error("Missing becomes token during assignment");
        }
    }
}