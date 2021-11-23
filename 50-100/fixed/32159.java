protected boolean pushParamName(boolean isTypeParam) {
    if (super.pushParamName(isTypeParam)) {
        org.eclipse.wst.jsdt.internal.compiler.ast.Expression expression = ((org.eclipse.wst.jsdt.internal.compiler.ast.Expression) (astStack[astPtr]));
        if (((expression.sourceStart) <= (this.selectionStart)) && ((this.selectionEnd) <= (expression.sourceEnd))) {
            selectedNode = expression;
            this.abort = true;
            if (org.eclipse.wst.jsdt.internal.codeassist.SelectionEngine.DEBUG) {
                java.lang.System.out.println(("	selected param=" + (selectedNode)));
            }
        }
    }
    return false;
}