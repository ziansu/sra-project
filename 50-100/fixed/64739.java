private java.util.Set<javax.lang.model.element.TypeElement> getAllIDirectInterfaces(javax.lang.model.element.TypeElement type) {
    java.util.Set<javax.lang.model.element.TypeElement> results = new java.util.HashSet<javax.lang.model.element.TypeElement>(10);
    for (javax.lang.model.type.TypeMirror tmp : type.getInterfaces()) {
        javax.lang.model.element.TypeElement typeElement = ((javax.lang.model.element.TypeElement) (((javax.lang.model.type.DeclaredType) (tmp)).asElement()));
        results.add(typeElement);
    }
    return results;
}