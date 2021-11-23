public spoon.reflect.reference.CtTypeReference<?> getSuperclass() {
    spoon.reflect.declaration.CtType<T> t = getDeclaration();
    if (t != null) {
        return t.getSuperclass();
    }else {
        java.lang.Class<T> c = getActualClass();
        java.lang.Class<?> sc = c.getSuperclass();
        return getFactory().Type().createReference(sc);
    }
}