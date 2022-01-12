public Abstract.ClassField resolveClassField(com.jetbrains.jetpad.vclang.term.Abstract.ClassDefinition classDefinition, java.lang.String name, com.jetbrains.jetpad.vclang.error.ErrorReporter errorReporter, com.jetbrains.jetpad.vclang.term.Abstract.SourceNode cause) {
    com.jetbrains.jetpad.vclang.term.Abstract.Definition resolvedRef = nsProviders.dynamics.forClass(classDefinition).resolveName(name);
    if (resolvedRef instanceof com.jetbrains.jetpad.vclang.term.Abstract.ClassField) {
        return ((com.jetbrains.jetpad.vclang.term.Abstract.ClassField) (resolvedRef));
    }else {
        errorReporter.report((resolvedRef != null ? new com.jetbrains.jetpad.vclang.naming.error.WrongDefinition("Expected a class field", resolvedRef, cause) : new com.jetbrains.jetpad.vclang.naming.error.NotInScopeError(cause, name)));
        return null;
    }
}