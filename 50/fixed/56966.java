@java.lang.Override
public void visit(de.uni.bremen.monty.moco.ast.statement.WhileLoop node) {
    boolean needsReturnStatementCopy = needsReturnStatement;
    super.visit(node);
    needsReturnStatement = needsReturnStatementCopy;
}