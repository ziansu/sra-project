public static ashc.semantics.Member.Variable getVar(final java.lang.String id) {
    ashc.semantics.Member.Variable var = null;
    if ((var = ashc.semantics.Semantics.getVar(id, ashc.semantics.Scope.getScope())) != null)
        return var;
    
    return ashc.semantics.Semantics.getVar(id, new ashc.semantics.Semantics.TypeI(ashc.semantics.Semantics.typeStack.peek().qualifiedName.shortName, 0, false));
}