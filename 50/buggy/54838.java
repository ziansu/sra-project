@java.lang.Override
public com.jetbrains.jetpad.vclang.term.expr.visitor.CompareVisitor.Result visitLam(com.jetbrains.jetpad.vclang.term.Abstract.LamExpression expr, com.jetbrains.jetpad.vclang.term.expr.visitor.Expression other) {
    return new com.jetbrains.jetpad.vclang.term.expr.visitor.CompareVisitor.JustResult((expr == other ? com.jetbrains.jetpad.vclang.term.expr.visitor.CompareVisitor.CMP.EQUALS : checkLam(expr, other)));
}