public java.lang.Object visit(slp.Length length, java.lang.Object o) {
    return length.getExpression().accept(this, o);
}