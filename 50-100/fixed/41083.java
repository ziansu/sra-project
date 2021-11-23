private final void processField(java.lang.reflect.Field field, java.beans.PropertyDescriptor propertyDescriptor) {
    com.univocity.parsers.common.processor.Parsed annotation = field.getAnnotation(com.univocity.parsers.common.processor.Parsed.class);
    if (annotation != null) {
        com.univocity.parsers.common.processor.FieldMapping mapping = new com.univocity.parsers.common.processor.FieldMapping(beanClass, field, propertyDescriptor);
        if (processField(mapping)) {
            parsedFields.add(mapping);
            setupConversions(field, mapping);
        }
    }
}