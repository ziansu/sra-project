@java.lang.Override
public boolean applicable(com.github.reggar.ignorehashequals.Context context) {
    java.util.Map<java.lang.String, javax.lang.model.element.ExecutableElement> properties = context.properties();
    for (javax.lang.model.element.ExecutableElement element : properties.values()) {
        java.util.Set<java.lang.String> annotations = com.github.reggar.ignorehashequals.AutoValueIgnoreHashEqualsExtension.getAnnotations(element);
        com.github.reggar.ignorehashequals.AutoValueIgnoreHashEqualsExtension.annotationType = com.github.reggar.ignorehashequals.AnnotationType.from(annotations);
        if ((com.github.reggar.ignorehashequals.AutoValueIgnoreHashEqualsExtension.annotationType) == (AnnotationType.ERROR)) {
            throw new java.lang.RuntimeException(("Annotations are mutually exclusive, " + "only one annotation type can be included at the same time."));
        }
        return (com.github.reggar.ignorehashequals.AutoValueIgnoreHashEqualsExtension.annotationType) != (AnnotationType.NOT_PRESENT);
    }
    return false;
}