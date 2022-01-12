private Abstract.Expression visitBinding(com.jetbrains.jetpad.vclang.term.context.binding.Binding binding) {
    java.lang.String name = myNames.get(binding);
    return myFactory.makeVar(((binding instanceof com.jetbrains.jetpad.vclang.term.context.binding.InferenceBinding ? "?" : "") + (name != null ? name : (binding.getName()) == null ? "_" : binding.getName())));
}