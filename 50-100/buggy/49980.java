@java.lang.Override
public void visit(de.uni.bremen.monty.moco.ast.Block node) {
    boolean needsReturnStatementCopy = needsReturnStatement;
    for (de.uni.bremen.monty.moco.ast.declaration.Declaration declaration : node.getDeclarations()) {
        visitDoubleDispatched(declaration);
    }
    needsReturnStatement = needsReturnStatementCopy;
    for (de.uni.bremen.monty.moco.ast.statement.Statement statement : node.getStatements()) {
        visitDoubleDispatched(statement);
    }
}