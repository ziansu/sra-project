public boolean findBinding(java.util.Set<? extends com.jetbrains.jetpad.vclang.term.definition.Referable> bindings) {
    return this.<java.lang.Void, java.lang.Boolean>accept(new com.jetbrains.jetpad.vclang.term.expr.FindBindingVisitor(bindings), null);
}