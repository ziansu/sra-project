public void buildClass(bantam.util.ClassTreeNode classTreeNode) {
    this.methodSymbolTable = classTreeNode.getMethodSymbolTable();
    this.varSymbolTable = classTreeNode.getVarSymbolTable();
    if (!(classTreeNode.getName().equals("Object"))) {
        this.methodSymbolTable.setParent(classTreeNode.getParent().getMethodSymbolTable());
        this.varSymbolTable.setParent(classTreeNode.getParent().getVarSymbolTable());
    }
    classTreeNode.getASTNode().accept(this);
}