@java.lang.Override
public java.lang.String calculate(java.lang.String Expression, java.lang.String x) throws java.lang.IllegalArgumentException {
    java.lang.Double ans = null;
    if (Expression.contains("X"))
        Expression = Expression.replaceAll("X", "x");
    
    try {
        ans = parse_expression(Expression, x);
    } catch (java.lang.Exception e) {
        throw new java.lang.IllegalArgumentException(e.getMessage());
    }
    return ans.toString();
}