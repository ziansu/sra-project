public void visit(com.google.devtools.build.lib.syntax.ConditionalExpression node) {
    visit(node.getCondition());
    visit(node.getThenCase());
    if ((node.getElseCase()) != null) {
        visit(node.getElseCase());
    }
}