private void deleteHierarchy(com.intellij.codeInspection.emptyMethod.RefMethod refMethod, java.util.List<com.intellij.codeInspection.emptyMethod.PsiElement> result) {
    java.util.Collection<com.intellij.codeInspection.emptyMethod.RefMethod> derivedMethods = refMethod.getDerivedMethods();
    com.intellij.codeInspection.emptyMethod.RefMethod[] refMethods = derivedMethods.toArray(new com.intellij.codeInspection.emptyMethod.RefMethod[derivedMethods.size()]);
    for (com.intellij.codeInspection.emptyMethod.RefMethod refDerived : refMethods) {
        deleteMethod(refDerived, result);
    }
    deleteMethod(refMethod, result);
}