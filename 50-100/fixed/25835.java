private boolean updateExpressionList() {
    this.allDefinedExpressions = expressionBuilderGrid.getDefinedExpressions();
    if ((this.allDefinedExpressions) == null) {
        return false;
    }
    for (com.org.gnos.services.Expression expression : this.allDefinedExpressions) {
        com.org.gnos.services.Expressions.add(expression);
    }
    return true;
}