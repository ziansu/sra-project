@java.lang.Override
public void visit(final boa.compiler.visitors.Factor n, final java.lang.String arg) {
    firstFactor = n;
    n.getOperand().accept(this, arg);
    lastFactor = n.getOperand();
    for (final boa.compiler.visitors.Node f : n.getOps()) {
        firstFactor = n;
        f.accept(this, arg);
        lastFactor = f;
    }
}