@java.lang.Override
protected java.lang.String execAddressOp(net.unicoen.node.UniUnaryOp expr, net.unicoen.interpreter.Scope scope) {
    return (expr.operator) + (getLeftReference(expr.expr, scope).name);
}