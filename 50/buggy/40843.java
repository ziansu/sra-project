@java.lang.Override
public com.github.javaparser.ast.type.TypeParameter setAnnotations(com.github.javaparser.ast.NodeList<com.github.javaparser.ast.expr.AnnotationExpr> annotations) {
    notifyPropertyChange(ObservableProperty.ANNOTATIONS, this.annotations, annotations);
    this.annotations = com.github.javaparser.utils.Utils.assertNotNull(annotations);
    setAsParentNodeOf(this.annotations);
    return this;
}