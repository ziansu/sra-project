<T> spoon.reflect.reference.CtTypeReference<T> getTypeReference(org.eclipse.jdt.internal.compiler.lookup.TypeBinding binding, org.eclipse.jdt.internal.compiler.ast.TypeReference ref) {
    spoon.reflect.reference.CtTypeReference<T> ctRef = getTypeReference(binding);
    if ((ctRef != null) && (isCorrectTypeReference(ref))) {
        insertGenericTypesInNoClasspathFromJDTInSpoon(ref, ctRef);
        return ctRef;
    }
    spoon.reflect.reference.CtTypeReference<T> result = getTypeReference(ref);
    return result;
}