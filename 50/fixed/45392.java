@java.lang.Override
public java.lang.Object visit(bantam.visitor.Class_ node) {
    this.setCurrentClassName(node.getName());
    super.visit(node);
    return null;
}