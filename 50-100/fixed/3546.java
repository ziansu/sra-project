private com.jetbrains.jetpad.vclang.typechecking.visitor.CheckTypeVisitor.Result checkResult(com.jetbrains.jetpad.vclang.core.expr.type.ExpectedType expectedType, com.jetbrains.jetpad.vclang.typechecking.visitor.CheckTypeVisitor.Result result, com.jetbrains.jetpad.vclang.term.Abstract.Expression expression) {
    if (result == null)
        return null;
    
    if ((expectedType == null) || (!(expectedType instanceof com.jetbrains.jetpad.vclang.typechecking.visitor.Expression))) {
        expression.setWellTyped(myContext, result.expression);
        return result;
    }
    if (compare(result, ((com.jetbrains.jetpad.vclang.typechecking.visitor.Expression) (expectedType)), expression)) {
        expression.setWellTyped(myContext, result.expression);
        return result;
    }else {
        return null;
    }
}