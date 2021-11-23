public java.lang.Object createInstance(java.lang.String typeName) {
    java.lang.Class clazz = resolveType(typeName);
    if (clazz.getSimpleName().contains("Enum")) {
        return org.apache.commons.lang3.EnumUtils.getEnumList(clazz).get(0);
    }
    try {
        return clazz.newInstance();
    } catch (java.lang.InstantiationException | java.lang.IllegalAccessException e) {
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Could not create an instance of class %s.", clazz.getName()));
    }
}