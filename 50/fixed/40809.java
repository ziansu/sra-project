private boolean hasAnyError(com.redhat.ceylon.compiler.typechecker.tree.Node that) {
    if (!(that.getErrors().isEmpty()))
        return true;
    
    return false;
}