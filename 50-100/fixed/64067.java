public static boolean checkInMathExpression(simsql.compiler.MathExpression expression) {
    if (expression instanceof simsql.compiler.ArithmeticExpression) {
        return simsql.compiler.GeneralTableIndexChecker.checkInArithmeticExpression(((simsql.compiler.ArithmeticExpression) (expression)));
    }else
        if (expression instanceof simsql.compiler.GeneralFunctionExpression) {
            return simsql.compiler.GeneralTableIndexChecker.checkInGeneralFunctionExpression(((simsql.compiler.GeneralFunctionExpression) (expression)));
        }else
            if (expression instanceof simsql.compiler.NumericExpression) {
                return true;
            }else
                if (expression instanceof simsql.compiler.GeneralTableIndex) {
                    return true;
                }
            
        
    
    return false;
}