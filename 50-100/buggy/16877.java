public boolean canFindUsages(final com.intellij.psi.PsiElement psiElement) {
    final com.intellij.psi.impl.beanProperties.BeanProperty property = com.intellij.spring.model.properties.SpringPropertiesUtil.getBeanProperty(com.intellij.ide.DataManager.getInstance().getDataContext());
    if (property != null)
        return true;
    
    if ((psiElement instanceof com.intellij.psi.PsiMethod) && (com.intellij.spring.model.jam.utils.SpringJamUtils.isExternalBean(((com.intellij.psi.PsiMethod) (psiElement)))))
        return true;
    
    return (com.intellij.spring.model.converters.SpringBeanUtil.getTargetSpringBean(psiElement)) != null;
}