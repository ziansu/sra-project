@java.lang.Override
public void visit(de.uni.bremen.monty.moco.ast.statement.ConditionalStatement node) {
    visitDoubleDispatched(node.getCondition());
    final boolean needsReturnStatementCopy = this.needsReturnStatement;
    visitDoubleDispatched(node.getThenBlock());
    final boolean needsReturnStatementCopyThen = this.needsReturnStatement;
    this.needsReturnStatement = needsReturnStatementCopy;
    visitDoubleDispatched(node.getElseBlock());
    final boolean needsReturnStatementCopyElse = this.needsReturnStatement;
    if ((needsReturnStatementCopy && (!needsReturnStatementCopyThen)) && (!needsReturnStatementCopyElse)) {
        this.needsReturnStatement = false;
    }else {
        this.needsReturnStatement = needsReturnStatementCopy;
    }
}