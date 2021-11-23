public static boolean isStepImplementationsClass(uk.co.itmoore.intellisubsteps.psi.PsiClass psiClass) {
    uk.co.itmoore.intellisubsteps.psi.PsiAnnotation[] classAnnotations = psiClass.getModifierList().getAnnotations();
    for (uk.co.itmoore.intellisubsteps.psi.PsiAnnotation a : classAnnotations) {
        if (a.getQualifiedName().equals(com.technophobia.substeps.model.SubSteps.StepImplementations.class.getCanonicalName())) {
            return true;
        }
    }
    return false;
}