private boolean isSameType(javax.lang.model.element.TypeElement typeElement, java.lang.String typeName) {
    return typeUtils.isSameType(typeElement.asType(), elementUtils.getTypeElement(typeName).asType());
}