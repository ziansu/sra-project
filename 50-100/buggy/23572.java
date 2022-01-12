public static final com.sun.codemodel.JExpression getAnnotationMemberExpression(com.sun.codemodel.JAnnotationUse annotation, java.lang.String annotationMember) {
    com.sun.codemodel.JAnnotationValue annotationValue = annotation.getAnnotationMembers().get(annotationMember);
    if (annotationValue == null) {
        return null;
    }
    return ((com.sun.codemodel.JExpression) (com.sun.tools.xjc.addon.xew.CommonUtils.getPrivateField(annotationValue, "value")));
}