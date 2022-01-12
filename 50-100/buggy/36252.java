@java.lang.Override
public void visit(de.uni.bremen.monty.moco.ast.Block node) {
    final boolean needsReturnStatementCopy = this.needsReturnStatement;
    for (final de.uni.bremen.monty.moco.ast.declaration.Declaration declaration : node.getDeclarations()) {
        visitDoubleDispatched(declaration);
    }
    this.needsReturnStatement = needsReturnStatementCopy;
    for (final de.uni.bremen.monty.moco.ast.statement.Statement statement : node.getStatements()) {
        visitDoubleDispatched(statement);
    }
}