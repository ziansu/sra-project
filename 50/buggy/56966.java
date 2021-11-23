@java.lang.Override
public void visit(de.uni.bremen.monty.moco.ast.statement.WhileLoop node) {
    final boolean needsReturnStatementCopy = this.needsReturnStatement;
    super.visit(node);
    this.needsReturnStatement = needsReturnStatementCopy;
}