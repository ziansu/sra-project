@java.lang.Override
public com.squareup.javapoet.AnnotationSpec.Builder visitArray(java.util.List<? extends javax.lang.model.element.AnnotationValue> values, com.squareup.javapoet.AnnotationSpec.Entry entry) {
    for (javax.lang.model.element.AnnotationValue value : values) {
        value.accept(this, new com.squareup.javapoet.AnnotationSpec.Entry(entry.name, value));
    }
    return builder;
}