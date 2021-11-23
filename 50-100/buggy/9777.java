private void visitYieldExpression(com.google.javascript.rhino.Node n) {
    if (n.getParent().isExprResult()) {
        return ;
    }
    if ((decomposer.canExposeExpression(n)) != (ExpressionDecomposer.DecompositionType.UNDECOMPOSABLE)) {
        decomposer.exposeExpression(n);
        compiler.reportCodeChange();
    }else {
        compiler.report(com.google.javascript.jscomp.JSError.make(currentStatement, Es6ToEs3Converter.CANNOT_CONVERT, "Undecomposable expression"));
    }
}