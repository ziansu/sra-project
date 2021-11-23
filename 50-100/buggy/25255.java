public fr.labri.gumtree.tree.Tree generate(java.lang.String source, java.lang.String file) {
    org.mozilla.javascript.Parser p = new org.mozilla.javascript.Parser();
    org.mozilla.javascript.ast.AstRoot root = p.parse(source, file, 1);
    ca.ubc.ece.salt.sdjsb.ast.ConditionalPreProcessor conditionalPreProcessor = new ca.ubc.ece.salt.sdjsb.ast.ConditionalPreProcessor();
    conditionalPreProcessor.process(root);
    ca.ubc.ece.salt.sdjsb.ast.ShortCircuitPreProcessor shortCircuitPreProcessor = new ca.ubc.ece.salt.sdjsb.ast.ShortCircuitPreProcessor();
    shortCircuitPreProcessor.process(root);
    fr.labri.gumtree.gen.js.RhinoTreeVisitor visitor = new fr.labri.gumtree.gen.js.RhinoTreeVisitor(root);
    root.visit(visitor);
    this.treeNodeMap = visitor.getTreeNodeMap();
    return visitor.getTree();
}