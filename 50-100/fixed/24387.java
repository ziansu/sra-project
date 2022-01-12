private static boolean isCalculatable(Calculator.Expression expression) {
    if ((expression.GetType()) == (Calculator.Expression.ExpressionType.Digit))
        return true;
    
    if ((expression.GetType()) == (Calculator.Expression.ExpressionType.Variable))
        if ((((Calculator.Variable) (expression)).variable_type) == (Calculator.Variable.VariableType.BooleanVariable))
            return true;
        
    
    return false;
}