public Abstract.ClassField resolveClassField(com.jetbrains.jetpad.vclang.term.Abstract.ClassDefinition classDefinition, java.lang.String name) {
    com.jetbrains.jetpad.vclang.term.Abstract.Definition resolvedRef = nsProviders.dynamics.forClass(classDefinition).resolveName(name);
    if (resolvedRef instanceof com.jetbrains.jetpad.vclang.term.Abstract.ClassField) {
        return ((com.jetbrains.jetpad.vclang.term.Abstract.ClassField) (resolvedRef));
    }else {
        return null;
    }
}