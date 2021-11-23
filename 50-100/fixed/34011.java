public void assemble() {
    com.intellij.psi.PsiClass topLevelClass = com.intellij.psi.util.PsiUtil.getTopLevelClass(psiMethod);
    com.intellij.psi.PsiParameter[] parameters = psiMethod.getParameterList().getParameters();
    com.intellij.psi.PsiType fromType = parameters[0].getType();
    com.intellij.psi.PsiType toType = psiMethod.getReturnType();
    com.intellij.psi.PsiMethod translatorMethod = psiBuilder.createTranslatorMethod(topLevelClass, fromType, toType, psiMethod, false);
    replaceMethod(translatorMethod);
    generateScheduledTranslatorMethods(topLevelClass);
}