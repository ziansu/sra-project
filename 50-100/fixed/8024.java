public java.lang.String copy(com.google.auto.value.processor.AutoValueProcessor.Property property) {
    if ((copyOf) == null) {
        return property.toString();
    }
    java.lang.String copy = java.lang.String.format(copyOf, property);
    if (property.isNullable()) {
        copy = java.lang.String.format("(%s == null ? null : %s)", property, copy);
    }
    return copy;
}