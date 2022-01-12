@java.lang.Override
public CheckTypeVisitor.Result infer(com.jetbrains.jetpad.vclang.term.Abstract.BinOpExpression expr, com.jetbrains.jetpad.vclang.typechecking.implicitargs.Expression expectedType) {
    com.jetbrains.jetpad.vclang.term.Concrete.Position position = (expr instanceof com.jetbrains.jetpad.vclang.term.Concrete.Expression) ? ((com.jetbrains.jetpad.vclang.term.Concrete.Expression) (expr)).getPosition() : com.jetbrains.jetpad.vclang.term.ConcreteExpressionFactory.POSITION;
    com.jetbrains.jetpad.vclang.term.expr.visitor.CheckTypeVisitor.Result result = inferArg(inferArg(new com.jetbrains.jetpad.vclang.term.Concrete.DefCallExpression(position, expr.getResolvedBinOpName()), expr.getLeft(), true, null), expr.getRight(), true, expr);
    myVisitor.updateAppResult(result, expr);
    return result;
}