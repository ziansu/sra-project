@com.google.errorprone.annotations.CanIgnoreReturnValue
private com.squareup.javapoet.FieldSpec addConstructorParameterAndTypeField(com.squareup.javapoet.TypeName typeName, java.lang.String variableName, com.squareup.javapoet.TypeSpec.Builder factoryBuilder, com.squareup.javapoet.MethodSpec.Builder constructorBuilder) {
    com.squareup.javapoet.FieldSpec field = com.squareup.javapoet.FieldSpec.builder(typeName, variableName, javax.lang.model.element.Modifier.PRIVATE, javax.lang.model.element.Modifier.FINAL).build();
    factoryBuilder.addField(field);
    com.squareup.javapoet.ParameterSpec parameter = com.squareup.javapoet.ParameterSpec.builder(typeName, variableName).build();
    constructorBuilder.addParameter(parameter);
    constructorBuilder.addCode("assert $1N != null; this.$2N = $1N;", parameter, field);
    return field;
}