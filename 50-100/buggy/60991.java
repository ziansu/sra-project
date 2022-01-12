private java.lang.String getSimpleClassName(final javax.lang.model.type.TypeMirror t) {
    java.lang.String res = null;
    if (t instanceof javax.lang.model.type.DeclaredType) {
        final javax.lang.model.type.DeclaredType dt = ((javax.lang.model.type.DeclaredType) (t));
        res = ((javax.lang.model.element.TypeElement) (dt.asElement())).getSimpleName().toString();
    }
    return res;
}