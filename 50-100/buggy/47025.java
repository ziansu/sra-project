public void typeCheckAST(miniJava.ContextAnalyzer.AST ast) {
    java.lang.System.out.println("======= AST  Type Checker =========================");
    miniJava.ContextAnalyzer.Type astType = null;
    try {
        astType = ast.visit(this, null);
    } catch (miniJava.ContextAnalyzer.typeChecker.TypeCheckError ie) {
        java.lang.System.out.println("Type check error occurred");
    }
    if (astType != null) {
        if ((astType.typeKind) == (TypeKind.VOID))
            java.lang.System.out.println("Type checking successfully completed");
        
    }
    java.lang.System.out.println("=============================================");
}