private void computeDeclaringTypes(java.util.List<org.eclipse.jdt.internal.core.nd.java.NdTypeSignature> result) {
    org.eclipse.jdt.internal.core.nd.java.NdComplexTypeSignature declaringType = getGenericDeclaringType();
    if (declaringType != null) {
        computeDeclaringTypes(result);
    }
    result.add(declaringType);
}