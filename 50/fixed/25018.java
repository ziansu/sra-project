public void visit(com.google.devtools.build.lib.syntax.ForStatement node) {
    visit(node.getCollection());
    visit(node.getVariable());
    visitBlock(node.getBlock());
}