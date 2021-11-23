public java.util.List<com.openpojo.reflection.PojoClass> validate(java.lang.String packageName, com.openpojo.reflection.PojoClassFilter... filters) {
    com.openpojo.reflection.PojoClassFilter pojoClassFilter = new com.openpojo.reflection.filters.FilterChain(filters);
    java.util.List<com.openpojo.reflection.PojoClass> pojoClasses = com.openpojo.reflection.impl.PojoClassFactory.getPojoClasses(packageName, pojoClassFilter);
    validate(pojoClasses);
    return pojoClasses;
}