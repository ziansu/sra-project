boolean shouldFieldBeIgnoredForValidation(com.blackbuild.groovy.configdsl.transform.ast.FieldNode fieldNode) {
    if ((com.blackbuild.groovy.configdsl.transform.ast.ASTHelper.getAnnotation(fieldNode, com.blackbuild.groovy.configdsl.transform.ast.DSLASTTransformation.IGNORE_ANNOTATION)) != null)
        return true;
    
    if (fieldNode.getName().startsWith("$"))
        return true;
    
    if (((fieldNode.getModifiers()) & (ACC_TRANSIENT)) != 0)
        return true;
    
    return false;
}