@java.lang.Override
public com.squareup.javapoet.MethodSpec getMethodSpec() {
    com.squareup.javapoet.MethodSpec.Builder methodBuilder = com.squareup.javapoet.MethodSpec.methodBuilder("loadFromCursor").addAnnotation(java.lang.Override.class).addModifiers(javax.lang.model.element.Modifier.PUBLIC, javax.lang.model.element.Modifier.FINAL).addParameter(ClassNames.CURSOR, com.raizlabs.android.dbflow.processor.definition.method.LoadFromCursorMethod.PARAM_CURSOR).addParameter(baseTableDefinition.getParameterClassName(isModelContainerAdapter), com.raizlabs.android.dbflow.processor.utils.ModelUtils.getVariable(isModelContainerAdapter)).returns(TypeName.VOID);
    java.util.List<com.raizlabs.android.dbflow.processor.definition.column.ColumnDefinition> columnDefinitionList = baseTableDefinition.getColumnDefinitions();
    for (com.raizlabs.android.dbflow.processor.definition.column.ColumnDefinition columnDefinition : columnDefinitionList) {
        methodBuilder.addCode(columnDefinition.getLoadFromCursorMethod(isModelContainerAdapter));
    }
    return methodBuilder.build();
}