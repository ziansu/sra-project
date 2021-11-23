public static ashc.semantics.Member.Variable getVar(final java.lang.String id) {
    if ((ashc.semantics.Scope.getScope()) != null)
        for (final ashc.semantics.Member.Variable var : ashc.semantics.Scope.getScope().vars)
            if (var.id.equals(id))
                return var;
            
        
    
    return ashc.semantics.Semantics.getVar(id, new ashc.semantics.Semantics.TypeI(ashc.semantics.Semantics.typeStack.peek().qualifiedName.shortName, 0, false));
}