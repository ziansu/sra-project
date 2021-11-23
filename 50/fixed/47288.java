private java.lang.String setter(java.lang.reflect.Field field) {
    return "set" + (capitalize(field.getName()));
}