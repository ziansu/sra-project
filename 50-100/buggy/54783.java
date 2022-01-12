private java.lang.String getElementNameForCollectionField(com.blackbuild.groovy.configdsl.transform.ast.FieldNode fieldNode) {
    com.blackbuild.groovy.configdsl.transform.ast.AnnotationNode fieldAnnotation = com.blackbuild.groovy.configdsl.transform.ast.ASTHelper.getAnnotation(fieldNode, com.blackbuild.groovy.configdsl.transform.ast.DSLASTTransformation.DSL_FIELD_ANNOTATION);
    java.lang.String result = getNullSafeMemberStringValue(fieldAnnotation, "members", null);
    if ((result != null) && ((result.length()) > 0))
        return result;
    
    java.lang.String collectionMethodName = fieldNode.getName();
    if (collectionMethodName.endsWith("s"))
        return collectionMethodName.substring(0, ((collectionMethodName.length()) - 1));
    
    return collectionMethodName;
}