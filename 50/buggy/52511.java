public void addExpression(cern.c2mon.shared.client.expression.Expression expression) {
    this.expressions = (expression == null) ? new java.util.ArrayList<>() : this.expressions;
    this.expressions.add(expression);
}