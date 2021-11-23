@java.lang.Override
public java.util.ArrayList<org.w3c.dom.Node> visitApSlash(ApSlashContext ctx) {
    java.lang.String filename = ctx.tag.getText();
    if ((tree) == null)
        tree = new DomTree(filename);
    
    java.util.ArrayList<org.w3c.dom.Node> root = new java.util.ArrayList<org.w3c.dom.Node>();
    root.add(tree.root);
    stack.push(root);
    return visit(ctx.rp());
}