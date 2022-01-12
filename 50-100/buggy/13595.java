private boolean isSuperCallInOverridingMethod(com.puppycrawl.tools.checkstyle.api.DetailAST ast) {
    boolean inOverridingMethod = false;
    com.puppycrawl.tools.checkstyle.api.DetailAST dotAst = ast;
    while (((dotAst != null) && ((dotAst.getType()) != (com.puppycrawl.tools.checkstyle.api.TokenTypes.CTOR_DEF))) && ((dotAst.getType()) != (com.puppycrawl.tools.checkstyle.api.TokenTypes.INSTANCE_INIT))) {
        if ((dotAst.getType()) == (com.puppycrawl.tools.checkstyle.api.TokenTypes.METHOD_DEF)) {
            inOverridingMethod = isOverridingMethod(dotAst);
            break;
        }
        dotAst = dotAst.getParent();
    } 
    return inOverridingMethod;
}