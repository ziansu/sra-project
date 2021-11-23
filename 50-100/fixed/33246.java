public void isControlDependency(org.eclipse.jdt.core.dom.ASTNode node) {
    ca.uwaterloo.ece.qhanam.slicer.ControlDependencyVisitor.ReturnVisitor rv = new ca.uwaterloo.ece.qhanam.slicer.ControlDependencyVisitor.ReturnVisitor();
    if (ca.uwaterloo.ece.qhanam.slicer.ControlDependencyVisitor.contains(node, this.seed)) {
        this.result = true;
        return ;
    }
    node.accept(rv);
    this.result = rv.result;
}