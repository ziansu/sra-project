private wyal.lang.WyalFile.Type checkArithmeticOperator(wyal.lang.WyalFile.Expr.Operator expr) {
    checkOperands(expr, new wyal.lang.WyalFile.Type.Int());
    return new wyal.lang.WyalFile.Type.Int();
}