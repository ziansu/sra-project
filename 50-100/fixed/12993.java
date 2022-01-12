private void updateExpressionPartWithSubExpression(java.util.Stack subexpressionStack) {
    while (!(subexpressionStack.empty())) {
        subexpression += subexpressionStack.pop();
    } 
    if ((subexpression) != "") {
        expressionParts.add(new app.com.example.grace.currencycalculator.models.Operand(new java.lang.StringBuilder(subexpression).reverse().toString()));
        subexpression = "";
    }
}