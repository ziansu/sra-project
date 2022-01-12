@java.lang.Override
public com.squareup.javapoet.AnnotationSpec.Builder visitType(javax.lang.model.type.TypeMirror t, com.squareup.javapoet.AnnotationSpec.Entry entry) {
    return builder.addMember(entry.name, "$T.class", t);
}