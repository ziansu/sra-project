private static java.util.Map<java.lang.String, net.oneandone.troilus.BeanMapper.PropertyWriter> fetchFieldWriters(com.google.common.collect.ImmutableSet<java.lang.reflect.Field> beanFields) {
    java.util.Map<java.lang.String, net.oneandone.troilus.BeanMapper.PropertyWriter> propertyWriters = com.google.common.collect.Maps.newHashMap();
    for (java.lang.reflect.Field beanField : beanFields) {
        final java.lang.reflect.net.oneandone.troilus.Field field = beanField.getAnnotation(java.lang.reflect.Field.class);
        if (field != null) {
            propertyWriters.put(field.name(), new net.oneandone.troilus.BeanMapper.PropertyWriter(field.name(), beanField));
        }
    }
    return com.google.common.collect.ImmutableMap.copyOf(propertyWriters);
}