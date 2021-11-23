private java.lang.String getAnnotationKey(java.lang.reflect.Member member) {
    if (member instanceof java.lang.reflect.AnnotatedElement) {
        return getAnnotationKey(((java.lang.reflect.AnnotatedElement) (member)));
    }
    return null;
}