private java.util.Set<java.lang.String> getAllIDirectInterfaces(javax.lang.model.element.TypeElement type) {
    java.util.Set<java.lang.String> results = new java.util.HashSet<java.lang.String>(10);
    for (javax.lang.model.type.TypeMirror tmp : type.getInterfaces()) {
        javax.lang.model.element.TypeElement typeElement = ((javax.lang.model.element.TypeElement) (((javax.lang.model.type.DeclaredType) (tmp)).asElement()));
        results.add(typeElement.getQualifiedName().toString());
    }
    return results;
}