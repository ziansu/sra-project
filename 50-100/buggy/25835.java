private boolean updateExpressionList() {
    com.org.gnos.services.Expressions expressions = new com.org.gnos.services.Expressions();
    this.allDefinedExpressions = expressionBuilderGrid.getDefinedExpressions();
    if ((this.allDefinedExpressions) == null) {
        return false;
    }
    for (com.org.gnos.services.Expression expression : this.allDefinedExpressions) {
        expressions.add(expression);
    }
    return true;
}