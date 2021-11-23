public com.intellij.psi.PsiElement getNameIdentifier() {
    com.intellij.lang.ASTNode keyNode = getNode().findChildByType(ScriptTypes.SCRIPT_IDENTIFIER);
    if (keyNode == null) {
        keyNode = getNode().findChildByType(ScriptTypes.SCRIPT_REFERENCE);
    }
    if (keyNode != null) {
        return keyNode.getPsi();
    }else {
        return null;
    }
}