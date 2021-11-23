public R visit(final visitor.Inicio n) {
    R nRes = null;
    n.f0.accept(this);
    return nRes;
}