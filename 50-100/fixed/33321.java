private java.util.List<java.lang.String> getMultipleParentTypes(java.lang.reflect.Type[] parentTypes, java.lang.reflect.AnnotatedType[] annotatedTypes) {
    java.util.List<java.lang.String> multipleParentTypes = new java.util.ArrayList<>();
    for (int index = 0; index < (parentTypes.length); index++) {
        multipleParentTypes.add(getSingleParentType(parentTypes[index], ((annotatedTypes.length) != 0 ? annotatedTypes[index] : null)));
    }
    return multipleParentTypes;
}