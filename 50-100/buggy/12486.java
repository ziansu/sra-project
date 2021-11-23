public void removeType(java.lang.String name) {
    org.yakindu.base.types.Type type = typeRegistry.get(name);
    if (type != null) {
        extendsRegistry.removeAll(type);
        resource.getContents().remove(type);
        typeRegistry.remove(name);
    }
}