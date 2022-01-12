private java.lang.String getMethodParametersAsString(org.eclipse.jdt.core.IMethod method) throws org.eclipse.jdt.core.JavaModelException {
    org.eclipse.jdt.core.ILocalVariable[] parameters = method.getParameters();
    java.util.Map<java.lang.String, java.lang.String> parametersMap = new java.util.LinkedHashMap<>();
    for (org.eclipse.jdt.core.ILocalVariable parameter : parameters) {
        parametersMap.put(getParameterType(parameter.getTypeSignature()), parameter.getElementName());
    }
    return getParametersAsString(parametersMap);
}