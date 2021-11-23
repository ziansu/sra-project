@java.lang.Override
public boolean equals(java.lang.Object o) {
    if (!(o instanceof org.snt.inmemantlr.tree.AstNode))
        return false;
    
    org.snt.inmemantlr.tree.AstNode n = ((org.snt.inmemantlr.tree.AstNode) (o));
    return ((((n.getId()) == (this.getId())) && (n.ntype.equals(this.ntype))) && (n.label.equals(this.label))) && (this.children.equals(n.children));
}