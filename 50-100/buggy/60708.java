@java.lang.Override
public void visit(de.uni.bremen.monty.moco.ast.statement.ReturnStatement node) {
    super.visit(node);
    this.needsReturnStatement = false;
    for (de.uni.bremen.monty.moco.ast.ASTNode currentNode = node; currentNode != null; currentNode = currentNode.getParentNode()) {
        if (currentNode instanceof de.uni.bremen.monty.moco.ast.declaration.ProcedureDeclaration) {
            return ;
        }
    }
    throw new de.uni.bremen.monty.moco.exception.InvalidControlFlowException(node, "Unable to find enclosing Function-/ProcedureDeclaration.");
}