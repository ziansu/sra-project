public fr.labri.gumtree.tree.Tree generate(java.lang.String source, java.lang.String file) {
    org.mozilla.javascript.Parser p = new org.mozilla.javascript.Parser();
    org.mozilla.javascript.ast.AstRoot root = p.parse(source, file, 1);
    fr.labri.gumtree.gen.js.RhinoTreeVisitor visitor = new fr.labri.gumtree.gen.js.RhinoTreeVisitor(root);
    root.visit(visitor);
    this.treeNodeMap = visitor.getTreeNodeMap();
    return visitor.getTree();
}