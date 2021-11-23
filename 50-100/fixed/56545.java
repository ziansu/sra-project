public void addDefinition(java.lang.String name, final com.jetbrains.jetpad.vclang.term.definition.Referable def) {
    final com.jetbrains.jetpad.vclang.term.definition.Referable prev = myNames.put(name, def);
    if ((prev != null) && (prev != def)) {
        throw new com.jetbrains.jetpad.vclang.naming.namespace.InvalidNamespaceException() {
            @java.lang.Override
            public com.jetbrains.jetpad.vclang.error.GeneralError toError() {
                return new com.jetbrains.jetpad.vclang.naming.error.DuplicateDefinitionError(prev, def);
            }
        };
    }
}