@java.lang.SuppressWarnings(value = "RedundantIfStatement")
boolean shouldFieldBeIgnored(com.blackbuild.groovy.configdsl.transform.ast.FieldNode fieldNode) {
    if (fieldNode == (keyField))
        return true;
    
    if (fieldNode == (ownerField))
        return true;
    
    if ((com.blackbuild.groovy.configdsl.transform.ast.ASTHelper.getAnnotation(fieldNode, com.blackbuild.groovy.configdsl.transform.ast.DSLASTTransformation.IGNORE_ANNOTATION)) != null)
        return true;
    
    if (fieldNode.isFinal())
        return true;
    
    if (fieldNode.getName().startsWith("$"))
        return true;
    
    if (((fieldNode.getModifiers()) & (ACC_TRANSIENT)) != 0)
        return true;
    
    return false;
}