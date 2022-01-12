public boolean isExceptionHandled(@org.jetbrains.annotations.NotNull
com.intellij.psi.PsiModifierListOwner psiModifierListOwner, com.intellij.psi.PsiClassType exceptionClassType) {
    final com.intellij.psi.PsiAnnotation psiAnnotation = com.intellij.codeInsight.AnnotationUtil.findAnnotation(psiModifierListOwner, de.plushnikov.intellij.plugin.handler.SneakyThrowsExceptionHandler.ANNOTATION_FQN);
    if (psiAnnotation == null) {
        return false;
    }
    final java.util.Collection<com.intellij.psi.PsiType> sneakedExceptionTypes = de.plushnikov.intellij.plugin.util.PsiAnnotationUtil.getAnnotationValues(psiAnnotation, PsiAnnotation.DEFAULT_REFERENCED_METHOD_NAME, com.intellij.psi.PsiType.class);
    return ((sneakedExceptionTypes.isEmpty()) || (sneakedExceptionTypes.iterator().next().equalsToText(de.plushnikov.intellij.plugin.handler.SneakyThrowsExceptionHandler.JAVA_LANG_THROWABLE))) || (isExceptionHandled(exceptionClassType, sneakedExceptionTypes));
}