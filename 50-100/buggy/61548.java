@java.lang.Override
public java.util.ArrayList<org.w3c.dom.Node> visitApDeep(ApDeepContext ctx) {
    java.lang.String filename = ctx.tag.getText();
    tree = new DomTree(filename);
    java.util.ArrayList<org.w3c.dom.Node> nodes = descOrSelf(tree.root);
    stack.push(nodes);
    return Utils.getUnique(visit(ctx.rp()));
}