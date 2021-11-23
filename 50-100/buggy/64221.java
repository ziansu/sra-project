private void visitExpressions(com.google.template.soy.soytree.SoyNode.ExprHolderNode node) {
    com.google.template.soy.passes.ResolveNamesVisitor.ResolveNamesExprVisitor exprVisitor = new com.google.template.soy.passes.ResolveNamesVisitor.ResolveNamesExprVisitor(node);
    for (com.google.template.soy.soytree.ExprUnion exprUnion : node.getAllExprUnions()) {
        if ((exprUnion.getExpr()) != null) {
            exprVisitor.exec(exprUnion.getExpr());
        }
    }
}