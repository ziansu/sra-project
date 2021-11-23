private void annotateNameReferenceNodes(@org.jetbrains.annotations.NotNull
com.intellij.psi.PsiElement element, @org.jetbrains.annotations.NotNull
com.intellij.lang.annotation.AnnotationHolder holder) {
    com.intellij.lang.annotation.Annotation annotation = holder.createInfoAnnotation(element, null);
    annotation.setTextAttributes(BallerinaSyntaxHighlightingColors.ANNOTATION);
}