@java.lang.Override
public com.squareup.javapoet.AnnotationSpec.Builder visitEnumConstant(javax.lang.model.element.VariableElement c, java.lang.String name) {
    return builder.addMember(name, "$T.$L", c.asType(), c.getSimpleName());
}