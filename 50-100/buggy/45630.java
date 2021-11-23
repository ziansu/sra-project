private static final boolean resolveTypeParameter(final org.eclipse.jdt.core.IMethod method, final java.lang.String identifier, final java.lang.StringBuilder result) throws org.eclipse.jdt.core.JavaModelException {
    org.eclipse.jdt.core.IType type = method.getDeclaringType();
    if (org.eclipse.eclemma.internal.core.analysis.SignatureResolver.resolveTypeParameter(type, method.getTypeParameters(), identifier, result)) {
        return true;
    }
    while (type != null) {
        if (org.eclipse.eclemma.internal.core.analysis.SignatureResolver.resolveTypeParameter(type, type.getTypeParameters(), identifier, result)) {
            return true;
        }
        type = type.getDeclaringType();
    } 
    return false;
}