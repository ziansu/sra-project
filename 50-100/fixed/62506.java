@java.lang.Override
public <T> void visitCtExecutableReference(spoon.reflect.reference.CtExecutableReference<T> reference) {
    enter(reference);
    if (((reference.getDeclaringType()) != null) && ((reference.getDeclaringType().getDeclaringType()) == null)) {
        addImport(reference.getDeclaringType());
    }
    scan(reference.getActualTypeArguments());
    exit(reference);
}