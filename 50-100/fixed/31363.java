public void visit(com.google.devtools.build.lib.syntax.AbstractComprehension node) {
    for (com.google.devtools.build.lib.syntax.ListComprehension.Clause clause : node.getClauses()) {
        visit(clause.getExpression());
        if ((clause.getLValue()) != null) {
            visit(clause.getLValue());
        }
    }
    visitAll(node.getOutputExpressions());
}