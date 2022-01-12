private java.lang.String resolvePropertyName(java.lang.String name) {
    org.springframework.util.Assert.notNull(name, "Property name must not be null");
    java.lang.String resolvedName = checkPropertyName(name);
    if (resolvedName != null) {
        return resolvedName;
    }
    java.lang.String uppercasedName = name.toUpperCase();
    if (!(name.equals(uppercasedName))) {
        resolvedName = checkPropertyName(uppercasedName);
        if (resolvedName != null) {
            return resolvedName;
        }
    }
    return name;
}