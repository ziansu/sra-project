@java.lang.Override
public com.squareup.javapoet.AnnotationSpec.Builder visitEnumConstant(javax.lang.model.element.VariableElement c, com.squareup.javapoet.AnnotationSpec.Entry entry) {
    return builder.addMember(entry.name, "$T.$L", c.asType(), c.getSimpleName());
}