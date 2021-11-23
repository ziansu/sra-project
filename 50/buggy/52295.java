public java.lang.Object visit(slp.Length length, java.lang.Object o) {
    length.getExpression().accept(this, o);
    return null;
}