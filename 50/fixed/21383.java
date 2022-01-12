public de.uni.bremen.monty.moco.ast.ASTNode getParentNodeByType(java.lang.Class type) {
    de.uni.bremen.monty.moco.ast.ASTNode n = getParentNode();
    while ((!(type.isInstance(n))) && (n != null)) {
        n = n.getParentNode();
    } 
    return n;
}