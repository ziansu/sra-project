private void compileLetStatement() {
    output.add("<letStatement>");
    goNext();
    eat(currentToken);
    goNext();
    eat(currentToken);
    goNext();
    if ((currentToken.getLecical()) == "[") {
        eat(currentToken);
        compileExpression();
        goNext();
        eat(currentToken);
    }
    eat(currentToken);
    compileExpression();
    goNext();
    eat(currentToken);
    output.add("</letStatement>");
}