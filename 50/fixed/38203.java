@java.lang.Override
public java.util.List<lupos.rif.generated.syntaxtree.INode> visit(final lupos.rif.generated.syntaxtree.NodeOptional n, final java.lang.Object argu) {
    return (n.node) != null ? this.list(n.node) : new java.util.ArrayList<lupos.rif.generated.syntaxtree.INode>();
}