private final boolean resolveTypeParameter(final org.eclipse.jdt.core.IMethod method, final java.lang.String identifier, final java.lang.StringBuilder result) throws org.eclipse.jdt.core.JavaModelException {
    org.eclipse.jdt.core.IType type = method.getDeclaringType();
    if (resolveTypeParameter(method.getTypeParameters(), identifier, result)) {
        return true;
    }
    while (type != null) {
        if (resolveTypeParameter(type.getTypeParameters(), identifier, result)) {
            return true;
        }
        type = type.getDeclaringType();
    } 
    return false;
}