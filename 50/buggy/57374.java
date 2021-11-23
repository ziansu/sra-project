@java.lang.Override
public void visit(de.uni.bremen.monty.moco.ast.declaration.FunctionDeclaration node) {
    needsReturnStatement = true;
    super.visit(node);
    if (needsReturnStatement) {
        throw new de.uni.bremen.monty.moco.exception.InvalidControlFlowException(node, "ReturnStatement needed.");
    }
}