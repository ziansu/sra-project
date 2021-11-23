@java.lang.Override
public Abstract.Expression visitDefCall(com.jetbrains.jetpad.vclang.core.expr.visitor.DefCallExpression expr, java.lang.Void params) {
    com.jetbrains.jetpad.vclang.term.Abstract.Expression result = checkBinOp(expr);
    if (result != null) {
        return result;
    }
    return visitArguments(myFactory.makeDefCall(null, expr.getDefinition().getAbstractDefinition()), expr, true);
}