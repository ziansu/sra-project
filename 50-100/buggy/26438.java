public void assemble() {
    com.intellij.psi.PsiClass builderClass = psiBuilder.createTranslatorClass(sourceClass, sourceClass);
    com.intellij.psi.PsiMethod translatorMethod = psiBuilder.createTranslatorMethod(builderClass, sourceClass, sourceClass, null);
    addToClass(builderClass, translatorMethod);
    generateScheduledTranslatorMethods(builderClass);
    psiFacade.shortenClassReferences(builderClass);
    psiFacade.reformat(builderClass);
    sourceClass.add(builderClass);
}