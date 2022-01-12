public static boolean varExists(final java.lang.String id) {
    ashc.semantics.Scope scope = ashc.semantics.Scope.getScope();
    if ((scope != null) && (scope.hasVar(id)))
        return true;
    
    for (final ashc.semantics.Member.Field field : ashc.semantics.Semantics.typeStack.peek().fields) {
        java.lang.System.out.println(field);
        if (field.qualifiedName.shortName.equals(id))
            return true;
        
    }
    return false;
}