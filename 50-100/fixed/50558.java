public boolean isBuiltInSub(@org.jetbrains.annotations.NotNull
com.perl5.lang.perl.psi.impl.PerlSubNameElementImpl subNameElement) {
    com.perl5.lang.perl.psi.impl.PsiElement parent = subNameElement.getParent();
    if (parent instanceof com.perl5.lang.perl.psi.impl.PerlMethod) {
        com.perl5.lang.perl.psi.impl.PsiElement grandParent = parent.getParent();
        if ((!(grandParent instanceof com.perl5.lang.perl.psi.impl.PsiPerlNestedCall)) && (((subNameElement.getPrevSibling()) == null) || (PerlPackageUtil.CORE_PACKAGE_FULL.equals(subNameElement.getPrevSibling().getText())))) {
            return com.perl5.lang.perl.util.PerlSubUtil.isBuiltIn(subNameElement.getText());
        }
    }
    return false;
}