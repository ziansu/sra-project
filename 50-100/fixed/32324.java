@java.lang.Override
public void visitToken(com.puppycrawl.tools.checkstyle.api.DetailAST ast) {
    if ((ast.getType()) == (com.puppycrawl.tools.checkstyle.api.TokenTypes.METHOD_DEF)) {
        if (!(counters.isEmpty())) {
            raiseCounter(ast);
        }
    }else {
        final boolean inInterface = (ast.getType()) == (com.puppycrawl.tools.checkstyle.api.TokenTypes.INTERFACE_DEF);
        counters.push(new com.puppycrawl.tools.checkstyle.checks.sizes.MethodCountCheck.MethodCounter(inInterface));
    }
}