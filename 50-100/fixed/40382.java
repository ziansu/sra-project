public static boolean canInsertOverride(com.intellij.codeInsight.generation.PsiMethod superMethod, com.intellij.codeInsight.generation.PsiClass targetClass) {
    if ((superMethod.isConstructor()) || (superMethod.hasModifierProperty(PsiModifier.STATIC))) {
        return false;
    }
    if (!(com.intellij.psi.util.PsiUtil.isLanguageLevel5OrHigher(targetClass))) {
        return false;
    }
    if (com.intellij.psi.util.PsiUtil.isLanguageLevel6OrHigher(targetClass)) {
        return true;
    }
    com.intellij.codeInsight.generation.PsiClass superClass = superMethod.getContainingClass();
    return (superClass != null) && (!(superClass.isInterface()));
}