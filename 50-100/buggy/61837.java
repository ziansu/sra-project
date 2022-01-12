public java.util.List<com.intellij.ide.util.treeView.AbstractTreeNode> filterByToken(java.util.Collection<com.intellij.ide.util.treeView.AbstractTreeNode> children, java.lang.String token) {
    java.util.List<com.intellij.ide.util.treeView.AbstractTreeNode> tokenList = new java.util.ArrayList<>();
    for (com.intellij.ide.util.treeView.AbstractTreeNode child : children) {
        if ((child.getValue()) instanceof com.intellij.psi.PsiFile) {
            com.intellij.psi.PsiFile file = ((com.intellij.psi.PsiFile) (child.getValue()));
            java.lang.String fileName = file.getName();
            if (fileName.startsWith(token)) {
                tokenList.add(child);
            }
        }
    }
    return tokenList;
}