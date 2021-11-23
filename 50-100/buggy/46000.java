private void compileReturnStatement() {
    output.add("<returnStatement>");
    goNext();
    eat(currentToken);
    goNext();
    if ((currentToken.getLecical()) != ";") {
        goBack();
        compileExpression();
        goNext();
    }
    eat(currentToken);
    output.add("</returnStatement>");
}