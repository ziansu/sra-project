@java.lang.Override
public java.lang.Boolean visitProj(com.jetbrains.jetpad.vclang.core.expr.visitor.ProjExpression expr1, com.jetbrains.jetpad.vclang.core.expr.visitor.Expression expr2) {
    if (!(expr2.isInstance(com.jetbrains.jetpad.vclang.core.expr.visitor.ProjExpression.class))) {
        return false;
    }
    com.jetbrains.jetpad.vclang.core.expr.visitor.ProjExpression proj2 = expr2.cast(com.jetbrains.jetpad.vclang.core.expr.visitor.ProjExpression.class);
    return ((expr1.getField()) == (proj2.getField())) && (compare(expr1.getExpression(), proj2.getExpression()));
}