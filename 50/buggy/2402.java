@java.lang.Override
public java.lang.Void visitCompoundAssignment(com.sun.source.tree.CompoundAssignmentTree node, java.lang.Void p) {
    commonAssignmentCheck(node.getVariable(), node.getExpression(), "compound.assignment.type.incompatible");
    return super.visitCompoundAssignment(node, p);
}