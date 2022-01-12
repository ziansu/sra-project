public void testJavaMethodOverridesChangeParam() throws java.lang.Exception {
    doJavaTest(new org.jetbrains.kotlin.idea.refactoring.changeSignature.JetChangeSignatureTest.JavaRefactoringProvider() {
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        org.jetbrains.kotlin.idea.refactoring.changeSignature.PsiType getNewReturnType(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.idea.refactoring.changeSignature.PsiMethod method) {
            return org.jetbrains.kotlin.idea.refactoring.changeSignature.PsiType.getJavaLangString(getPsiManager(), com.intellij.psi.search.GlobalSearchScope.allScope(getProject()));
        }

        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        com.intellij.refactoring.changeSignature.ParameterInfoImpl[] getNewParameters(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.idea.refactoring.changeSignature.PsiMethod method) {
            com.intellij.refactoring.changeSignature.ParameterInfoImpl[] newParameters = super.getNewParameters(method);
            newParameters[0].setName("x");
            newParameters[0].setType(PsiType.INT);
            return newParameters;
        }
    });
}