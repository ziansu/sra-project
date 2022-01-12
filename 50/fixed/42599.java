public void visit(com.github.davityle.ngprocessor.attrcompiler.node.ObjectField node) {
    node.getLHS().accept(this);
}