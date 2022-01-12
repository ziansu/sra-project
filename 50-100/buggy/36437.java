public static java.lang.String getParameters(final org.eclipse.jdt.core.IMethod method) throws org.eclipse.jdt.core.JavaModelException {
    if (method.isBinary()) {
        return org.eclipse.eclemma.internal.core.analysis.SignatureResolver.getParameters(method.getSignature());
    }
    final java.lang.StringBuilder buffer = new java.lang.StringBuilder();
    final java.lang.String[] parameterTypes = method.getParameterTypes();
    for (final java.lang.String t : parameterTypes) {
        org.eclipse.eclemma.internal.core.analysis.SignatureResolver.resolveArrayParameterType(method, t, buffer);
    }
    return buffer.toString();
}