public void addOperator(java.lang.String operator) {
    if ((!(java.util.Objects.equals(lastOperator, operator))) || (!(lastTokenIsOperator))) {
        lastOperator = operator;
        if (lastTokenIsOperator) {
            expression = expression.substring(0, ((expression.length()) - 1));
        }
        expression += operator;
        view.setResult(expression);
    }
    lastTokenIsOperator = true;
}