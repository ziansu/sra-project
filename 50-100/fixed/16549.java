public static MethodSpec.Builder forField(com.squareup.javapoet.FieldSpec field, java.lang.String namingConvention, com.squareup.javapoet.ParameterSpec returnObject) {
    com.squareup.javapoet.MethodSpec.Builder builder = com.squareup.javapoet.MethodSpec.methodBuilder(tech.cae.javabard.SetterSpec.makeName(namingConvention, field.name)).addJavadoc(field.javadoc).addParameter(field.type, field.name).addModifiers(javax.lang.model.element.Modifier.PUBLIC, javax.lang.model.element.Modifier.FINAL).addStatement("this.$N = $N", field.name, field.name);
    if (returnObject != null) {
        builder.returns(returnObject.type).addStatement("return $N", returnObject.name);
    }
    return builder;
}