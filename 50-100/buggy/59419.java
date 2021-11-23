private Abstract.Expression visitBinding(com.jetbrains.jetpad.vclang.term.context.binding.Binding binding) {
    java.lang.String name = ((binding.getName()) == null) ? "_" : binding.getName();
    java.lang.String name1 = myNames.get(name);
    return myFactory.makeVar(((binding instanceof com.jetbrains.jetpad.vclang.term.context.binding.InferenceBinding ? "?" : "") + (name1 != null ? name1 : name)));
}