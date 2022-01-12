private uk.co.cogitolearning.cogpar.ExpressionNode signedTerm() {
    if ((lookahead.token) == (Token.PLUSMINUS)) {
        int mode = (lookahead.sequence.equals("+")) ? AdditionExpressionNode.ADD : AdditionExpressionNode.SUB;
        nextToken();
        uk.co.cogitolearning.cogpar.ExpressionNode t = term();
        if (mode == (AdditionExpressionNode.ADD)) {
            return t;
        }else {
            return new uk.co.cogitolearning.cogpar.AdditionExpressionNode(t, AdditionExpressionNode.SUB);
        }
    }
    return term();
}