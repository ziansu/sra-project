public void writeWeakWrapperTo(javax.annotation.processing.Filer filer) throws java.io.IOException {
    com.stefandekanski.weakwrap.processor.MethodSpec constructor = createConstructor();
    com.stefandekanski.weakwrap.processor.FieldSpec weakWrapField = createWeakWrapField();
    java.util.List<com.stefandekanski.weakwrap.processor.MethodSpec> wrappedMethods = createWrappedMethods();
    com.stefandekanski.weakwrap.processor.TypeSpec wrappedType = com.stefandekanski.weakwrap.processor.TypeSpec.classBuilder(wrapClassName).addModifiers(javax.lang.model.element.Modifier.PUBLIC).addMethod(constructor).addField(weakWrapField).addMethods(wrappedMethods).build();
    com.stefandekanski.weakwrap.processor.JavaFile.builder(packageName, wrappedType).build().writeTo(filer);
}