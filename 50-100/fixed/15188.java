@java.lang.Override
public java.lang.Boolean visit(com.github.javaparser.symbolsolver.resolution.typeinference.BlockStmt n, java.lang.Void arg) {
    if (statement.getParentNode().isPresent()) {
        if ((statement.getParentNode().get()) instanceof com.github.javaparser.ast.body.ConstructorDeclaration) {
            return true;
        }
        if ((statement.getParentNode().get()) instanceof com.github.javaparser.ast.body.MethodDeclaration) {
            return true;
        }
        if ((statement.getParentNode().get()) instanceof com.github.javaparser.ast.body.InitializerDeclaration) {
            return true;
        }
    }
    return isReachableBecauseOfPosition(statement);
}