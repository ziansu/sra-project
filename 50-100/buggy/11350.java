public void checkTypes(bantam.util.ClassTreeNode classTreeNode) {
    this.classTreeNode = classTreeNode;
    bantam.visitor.Class_ classASTNode = this.classTreeNode.getASTNode();
    this.fieldScope = this.classTreeNode.getVarSymbolTable().getCurrScopeLevel();
    this.methodScope = this.classTreeNode.getMethodSymbolTable().getCurrScopeLevel();
    classASTNode.accept(this);
}