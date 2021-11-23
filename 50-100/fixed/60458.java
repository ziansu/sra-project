public org.esfinge.metadata.container.ContainerMetadados lerMetadados(java.lang.Class<?> classToMap) {
    org.esfinge.metadata.container.ContainerMetadados container = new org.esfinge.metadata.container.ContainerMetadados();
    for (java.lang.reflect.Method m : classToMap.getMethods()) {
        try {
            if (m.isAnnotationPresent(org.esfinge.metadata.container.BooleanAnnotation.class)) {
                org.esfinge.metadata.container.Properties p = new org.esfinge.metadata.container.Properties(m);
                p.setHasAnnotation(true);
                container.addPropriedade(p);
            }
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException("Erro recuperando propriedade", e);
        }
    }
    return container;
}