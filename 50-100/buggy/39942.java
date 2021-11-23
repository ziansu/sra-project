public java.lang.Void checkExpression(ast.expression.Binary expression) {
    expression.getLeftExpression().accept(this);
    expression.getRightExpression().accept(this);
    typechecker.elements.ExpressionChecker expressionCheckerLeft = new typechecker.elements.ExpressionChecker(this.errorCollector, this.typeRepository, expression.getLeftExpression());
    typechecker.elements.ExpressionChecker expressionCheckerRight = new typechecker.elements.ExpressionChecker(this.errorCollector, this.typeRepository, expression.getRightExpression());
    expressionCheckerLeft.checkType(expression.getType());
    expressionCheckerRight.checkType(expression.getType());
    return null;
}