private void compileExpressionList() {
    output.add("<expressionList>");
    compileExpression();
    goNext();
    while (currentToken.getLecical().equals(",")) {
        eat(currentToken);
        compileExpression();
        goNext();
    } 
    goBack();
    output.add("</expressionList>");
}