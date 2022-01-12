private static final void resolveArrayParameterType(final org.eclipse.jdt.core.IMethod method, final java.lang.String parameterType, final java.lang.StringBuilder result) throws org.eclipse.jdt.core.JavaModelException {
    final int arrayCount = org.eclipse.jdt.core.Signature.getArrayCount(parameterType);
    for (int i = 0; i < arrayCount; i++) {
        result.append(org.eclipse.jdt.core.Signature.C_ARRAY);
    }
    org.eclipse.eclemma.internal.core.analysis.SignatureResolver.resolveParameterType(method, parameterType.substring(arrayCount), result);
}