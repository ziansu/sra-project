@java.lang.Override
public com.jetbrains.jetpad.vclang.term.expr.visitor.CheckTypeVisitor.Result visitApp(com.jetbrains.jetpad.vclang.term.Abstract.AppExpression expr, com.jetbrains.jetpad.vclang.term.expr.type.Type expectedType) {
    com.jetbrains.jetpad.vclang.term.expr.visitor.CheckTypeVisitor.PreResult result = myArgsInference.infer(expr, expectedType);
    if ((result == null) || (!(checkPath(result, expr)))) {
        return null;
    }
    return checkResultImplicit(expectedType, checkDefCall(result, expr), expr);
}