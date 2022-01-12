protected java.lang.String getPackageName(final com.intellij.psi.PsiClass psiClass) {
    com.intellij.psi.PsiFile _containingFile = psiClass.getContainingFile();
    final com.intellij.psi.PsiJavaFile javaFile = ((com.intellij.psi.PsiJavaFile) (_containingFile));
    final java.lang.String psiPackageName = javaFile.getPackageName();
    boolean _isEmpty = psiPackageName.isEmpty();
    boolean _not = !_isEmpty;
    if (_not) {
        return psiPackageName;
    }
    return null;
}