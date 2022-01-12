@java.lang.Override
public com.intellij.usageView.UsageInfo toUsageInfo(final com.intellij.openapi.project.Project project) {
    com.intellij.psi.PsiClass psiClass = com.intellij.psi.JavaPsiFacade.getInstance(project).findClass(fqn, com.intellij.psi.search.GlobalSearchScope.projectScope(project));
    if (psiClass == null)
        return null;
    
    return new com.intellij.usageView.UsageInfo(psiClass, psiClass.getNameIdentifier().getStartOffsetInParent(), psiClass.getNameIdentifier().getStartOffsetInParent());
}