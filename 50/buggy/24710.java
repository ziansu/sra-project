private wyal.lang.WyalFile.Type checkArithmeticOperator(wyal.lang.WyalFile.Expr.Operator expr) {
    checkOperands(expr, Type.Int.class);
    return new wyal.lang.WyalFile.Type.Int();
}