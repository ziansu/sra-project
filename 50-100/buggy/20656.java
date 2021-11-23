private java.util.List<com.weirddev.testme.intellij.template.context.Param> extractMethodParams(com.weirddev.testme.intellij.template.context.PsiParameterList parameterList, com.weirddev.testme.intellij.template.TypeDictionary typeDictionary, int maxRecursionDepth, com.weirddev.testme.intellij.template.context.PsiMethod psiMethod) {
    java.util.ArrayList<com.weirddev.testme.intellij.template.context.Param> params = new java.util.ArrayList<com.weirddev.testme.intellij.template.context.Param>();
    for (com.weirddev.testme.intellij.template.context.PsiParameter psiParameter : parameterList.getParameters()) {
        final java.util.ArrayList<com.weirddev.testme.intellij.template.context.Field> assignedToFields = com.weirddev.testme.intellij.template.context.Method.findMatchingFields(psiParameter, new com.weirddev.testme.intellij.template.context.PsiMethod[]{ psiMethod });
        params.add(new com.weirddev.testme.intellij.template.context.Param(psiParameter, typeDictionary, maxRecursionDepth, assignedToFields));
    }
    return params;
}