private <T> org.gradle.tooling.ModelBuilder<T> model(java.lang.Class<T> modelType) {
    if (!(modelType.isInterface())) {
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Cannot fetch a model of type '%s' as this type is not an interface.", modelType.getName()));
    }
    return new org.gradle.tooling.internal.consumer.DefaultModelBuilder<T>(modelType, connection, parameters);
}