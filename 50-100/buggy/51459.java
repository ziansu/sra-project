private void checkIfCorrectlyEscaped(net.sourceforge.pmd.lang.vf.ast.ASTHtmlScript node, java.lang.Object data) {
    net.sourceforge.pmd.lang.vf.ast.ASTText prevText = null;
    for (int i = 0; i < (node.jjtGetNumChildren()); i++) {
        net.sourceforge.pmd.lang.ast.Node n = node.jjtGetChild(i);
        if (n instanceof net.sourceforge.pmd.lang.vf.ast.ASTText) {
            prevText = ((net.sourceforge.pmd.lang.vf.ast.ASTText) (n));
        }
        if (n instanceof net.sourceforge.pmd.lang.vf.ast.ASTElExpression) {
            processElInScriptContext(((net.sourceforge.pmd.lang.vf.ast.ASTElExpression) (n)), prevText, data);
        }
    }
}