private com.oracle.truffle.r.runtime.nodes.RSyntaxNode getArgumentNode(java.lang.Object arg) {
    if (arg instanceof com.oracle.truffle.r.runtime.data.RPromise) {
        com.oracle.truffle.r.runtime.data.RPromise p = ((com.oracle.truffle.r.runtime.data.RPromise) (arg));
        return p.getRep().asRSyntaxNode();
    }else
        if (!(arg instanceof com.oracle.truffle.r.runtime.data.RMissing)) {
            return com.oracle.truffle.r.nodes.access.ConstantNode.create(arg);
        }
    
    return null;
}