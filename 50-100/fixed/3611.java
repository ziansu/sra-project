private void compileClassVarDec() {
    output.add("<classVarDec>");
    goNext();
    eat(currentToken);
    goNext();
    eat(currentToken);
    goNext();
    eat(currentToken);
    goNext();
    while (currentToken.getLecical().equals(",")) {
        eat(currentToken);
        goNext();
        eat(currentToken);
        goNext();
    } 
    eat(currentToken);
    output.add("</classVarDec>");
}