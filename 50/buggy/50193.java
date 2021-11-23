public boolean findBinding(java.util.Set<? extends com.jetbrains.jetpad.vclang.term.definition.Referable> bindings) {
    return accept(new com.jetbrains.jetpad.vclang.term.expr.FindBindingVisitor(bindings), null);
}