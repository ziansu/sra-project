private java.lang.String resolveGroupKeyFromRuleMethod(java.lang.Object executable) throws java.lang.Exception {
    java.lang.reflect.Method methodWithGroupAnnotation = com.opnitech.rules.core.utils.AnnotationUtil.resolveMethodWithAnnotation(executable, com.opnitech.rules.core.annotations.group.GroupKey.class);
    if (methodWithGroupAnnotation == null) {
        return null;
    }
    java.lang.String groupKey = ((java.lang.String) (methodWithGroupAnnotation.invoke(executable)));
    if ((groupKey != null) && (org.apache.commons.lang3.StringUtils.isBlank(groupKey))) {
        com.opnitech.rules.core.utils.ExceptionUtil.throwIllegalArgumentException("Invalid Group Key method in the rule. A group method cannot return a blank String. Rule: ''{0}'', Group Key Method: ''{1}''", executable, methodWithGroupAnnotation.getName());
    }
    return groupKey;
}