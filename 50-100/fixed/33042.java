@java.lang.Override
public void visit(de.uni.bremen.monty.moco.ast.statement.ConditionalStatement node) {
    visitDoubleDispatched(node.getCondition());
    boolean needsReturnStatementCopy = needsReturnStatement;
    visitDoubleDispatched(node.getThenBlock());
    boolean needsReturnStatementCopyThen = needsReturnStatement;
    visitDoubleDispatched(node.getElseBlock());
    boolean needsReturnStatementCopyElse = needsReturnStatement;
    if ((needsReturnStatementCopy && (!needsReturnStatementCopyThen)) && (!needsReturnStatementCopyElse)) {
        needsReturnStatement = false;
    }else {
        needsReturnStatement = needsReturnStatementCopy;
    }
}