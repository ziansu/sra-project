@java.lang.Override
public boolean isWHNF() {
    return (myExpression.isWHNF()) && (!(myExpression.isInstance(com.jetbrains.jetpad.vclang.core.expr.NewExpression.class)));
}