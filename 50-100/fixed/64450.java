public void addAnnotationForMinus(com.sun.source.tree.ExpressionTree leftExpr, com.sun.source.tree.ExpressionTree rightExpr, org.checkerframework.framework.type.AnnotatedTypeMirror type) {
    org.checkerframework.framework.type.AnnotatedTypeMirror valueTypeRight = valueAnnotatedTypeFactory.getAnnotatedType(rightExpr);
    java.lang.Integer maybeValRight = maybeValFromValueType(valueTypeRight);
    if (maybeValRight != null) {
        org.checkerframework.framework.type.AnnotatedTypeMirror leftType = getAnnotatedType(leftExpr);
        int val = maybeValRight.intValue();
        addAnnotationForLiteralPlus(((-1) * val), leftType, type);
        return ;
    }
    type.addAnnotation(UNKNOWN);
    return ;
}