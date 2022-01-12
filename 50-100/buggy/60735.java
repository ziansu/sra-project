private void compileExpressionList() {
    output.add("<expressionList>");
    compileExpression();
    goNext();
    while ((currentToken.getLecical()) == ",") {
        eat(currentToken);
        compileExpression();
        goNext();
    } 
    goBack();
    output.add("</expressionList>");
}