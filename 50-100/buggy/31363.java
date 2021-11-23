public void visit(com.google.devtools.build.lib.syntax.AbstractComprehension node) {
    for (com.google.devtools.build.lib.syntax.ListComprehension.Clause clause : node.getClauses()) {
        if ((clause.getLValue()) != null) {
            visit(clause.getLValue());
        }
        visit(clause.getExpression());
    }
    visitAll(node.getOutputExpressions());
}