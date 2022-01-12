public com.jetbrains.jetpad.vclang.term.expr.visitor.CheckTypeVisitor.Result checkResultImplicit(com.jetbrains.jetpad.vclang.term.expr.visitor.Expression expectedType, com.jetbrains.jetpad.vclang.term.expr.visitor.CheckTypeVisitor.Result result, com.jetbrains.jetpad.vclang.term.Abstract.Expression expression) {
    if (result == null)
        return null;
    
    if (expectedType == null) {
        expression.setWellTyped(myContext, result.expression);
        return result;
    }
    return myArgsInference.inferTail(result, expectedType, expression);
}