public java.lang.Object VisitUnaryOperatorExpression(ASTUnaryOperatorExpression unaryexpression) {
    operator.operand().Accept(this);
    return null;
}