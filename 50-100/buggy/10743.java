@java.lang.Override
public com.jetbrains.jetpad.vclang.term.expr.visitor.CheckTypeVisitor.Result visitDefCall(com.jetbrains.jetpad.vclang.term.Abstract.DefCallExpression expr, com.jetbrains.jetpad.vclang.term.expr.type.Type expectedType) {
    com.jetbrains.jetpad.vclang.term.expr.visitor.CheckTypeVisitor.PreResult result = myTypeCheckingDefCall.typeCheckDefCall(expr);
    if ((result == null) || (!(checkPath(result, expr)))) {
        return null;
    }
    return checkResultImplicit(expectedType, checkDefCall(result), expr);
}