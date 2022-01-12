@java.lang.Override
public com.jetbrains.jetpad.vclang.term.expr.visitor.CheckTypeVisitor.Result visitBinOp(com.jetbrains.jetpad.vclang.term.Abstract.BinOpExpression expr, com.jetbrains.jetpad.vclang.term.expr.type.Type expectedType) {
    com.jetbrains.jetpad.vclang.term.expr.visitor.CheckTypeVisitor.PreResult result = myArgsInference.infer(expr, expectedType);
    if (result == null) {
        return null;
    }
    return checkResultImplicit(expectedType, checkDefCall(result, expr), expr);
}