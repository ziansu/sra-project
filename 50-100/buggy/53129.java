@java.lang.Override
public void visitTupleExpression(org.codehaus.groovy.ast.expr.TupleExpression node) {
    boolean shouldContinue = handleSimpleExpression(node);
    if (shouldContinue && (org.eclipse.jdt.groovy.search.TypeInferencingVisitorWithRequestor.isNotEmpty(node.getExpressions()))) {
        if ((node instanceof org.codehaus.groovy.ast.expr.ArgumentListExpression) || ((node.getExpression(0)) instanceof org.codehaus.groovy.ast.expr.NamedArgumentListExpression)) {
            super.visitTupleExpression(node);
        }
    }
}