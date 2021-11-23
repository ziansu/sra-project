private io.restzilla.RestInformation buildInformation(java.lang.Class<?> entityClass) throws java.lang.NoSuchMethodException {
    io.restzilla.RestResource annotation = entityClass.getAnnotationsByType(io.restzilla.RestResource.class)[0];
    java.lang.String basePath = annotation.basePath();
    if (org.apache.commons.lang3.StringUtils.isBlank(basePath)) {
        basePath = namingStrategy.getBasePath(entityClass);
    }
    if (!(annotation.entityClass().equals(java.lang.Object.class))) {
        entityClass = annotation.entityClass();
    }
    return new io.restzilla.RestInformation(entityClass, basePath, annotation);
}