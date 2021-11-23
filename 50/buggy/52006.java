@java.lang.Override
public void visit(de.uni.bremen.monty.moco.ast.declaration.FunctionDeclaration node) {
    this.needsReturnStatement = true;
    super.visit(node);
    if (this.needsReturnStatement) {
        throw new de.uni.bremen.monty.moco.exception.InvalidControlFlowException(node, "ReturnStatement needed.");
    }
}