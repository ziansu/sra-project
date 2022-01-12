public java.util.Collection<prompto.declaration.IMethodDeclaration> findPotentialMethods() {
    prompto.expression.MethodSelector selector = methodCall.getMethod();
    java.util.Collection<prompto.declaration.IMethodDeclaration> candidates = selector.getCandidates(context);
    if ((candidates.size()) == 0)
        throw new prompto.error.SyntaxError(("No method named:" + (methodCall.getMethod().getName())));
    
    return filterPotential(candidates);
}