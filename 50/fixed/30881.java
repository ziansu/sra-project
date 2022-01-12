private static com.puppycrawl.tools.checkstyle.api.DetailAST getMethodDef(com.puppycrawl.tools.checkstyle.api.DetailAST returnLit) {
    com.puppycrawl.tools.checkstyle.api.DetailAST methodDef = returnLit;
    while ((methodDef != null) && ((methodDef.getType()) != (com.puppycrawl.tools.checkstyle.api.TokenTypes.METHOD_DEF))) {
        methodDef = methodDef.getParent();
    } 
    return methodDef;
}