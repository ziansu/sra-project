private com.squareup.javapoet.TypeName getObjectBinderGenericTypeName(javax.lang.model.element.TypeElement hostElement) {
    com.squareup.javapoet.TypeName typeName = searchObjectBinderGenericTypeName(hostElement, java.util.Collections.emptyList());
    if (typeName != null) {
        return typeName;
    }else {
        return com.squareup.javapoet.TypeName.get(hostElement.asType());
    }
}