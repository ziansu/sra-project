@java.lang.Override
public com.jetbrains.jetpad.vclang.term.expr.visitor.CompareVisitor.Result visitLam(com.jetbrains.jetpad.vclang.term.Abstract.LamExpression expr, com.jetbrains.jetpad.vclang.term.expr.visitor.Expression other) {
    return expr == other ? new com.jetbrains.jetpad.vclang.term.expr.visitor.CompareVisitor.JustResult(com.jetbrains.jetpad.vclang.term.expr.visitor.CompareVisitor.CMP.EQUALS) : checkLam(expr, other);
}