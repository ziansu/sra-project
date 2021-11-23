public void visit(Variable e) {
    e.getValue().accept(this);
}