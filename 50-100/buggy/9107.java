protected java.util.Optional<T> getAnnotation(org.springframework.core.type.MethodMetadata metadata) {
    try {
        return java.util.Optional.ofNullable(java.lang.Class.forName(metadata.getReturnTypeName()).getDeclaredAnnotation(annotation));
    } catch (java.lang.ClassNotFoundException e) {
        io.cereebro.spring.annotation.LOGGER.error(("Could not load class : " + (metadata.getReturnTypeName())), e.getMessage());
    }
    return java.util.Optional.empty();
}