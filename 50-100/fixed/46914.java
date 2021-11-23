void generate() throws java.io.IOException {
    java.lang.String holderClassName = (className.getSimpleName().toString()) + (suffix);
    com.squareup.javapoet.TypeSpec holderClass = buildHolderClass(holderClassName, itemType);
    com.squareup.javapoet.JavaFile javaFile = com.squareup.javapoet.JavaFile.builder(elementUtils.getPackageOf(className).toString(), holderClass).build();
    javaFile.writeTo(filer);
}