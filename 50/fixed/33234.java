public org.fugazi.evaluator.ExpressionValue evaluateExpression(org.fugazi.ast.expression.Expression _expression) {
    return _expression.accept(this.expressionVisitor);
}