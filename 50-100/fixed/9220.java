protected java.lang.String getPackageName(final com.intellij.psi.PsiClass psiClass) {
    final com.intellij.psi.PsiFile javaFile = psiClass.getContainingFile();
    if (javaFile instanceof com.intellij.psi.PsiJavaFile) {
        final java.lang.String psiPackageName = ((com.intellij.psi.PsiJavaFile) (javaFile)).getPackageName();
        boolean _isEmpty = psiPackageName.isEmpty();
        boolean _not = !_isEmpty;
        if (_not) {
            return psiPackageName;
        }
    }
    return null;
}