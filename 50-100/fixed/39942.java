private java.lang.Void checkExpression(ast.expression.Binary expression) {
    expression.getLeftExpression().accept(this);
    expression.getRightExpression().accept(this);
    checkType(expression.getLeftExpression(), expression.getType());
    checkType(expression.getRightExpression(), expression.getType());
    return null;
}