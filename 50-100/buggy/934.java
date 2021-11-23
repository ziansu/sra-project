public void add(com.jetbrains.jetpad.vclang.term.expr.sort.LevelMax level) {
    if (level.isInfinity()) {
        myVars = null;
    }else {
        for (java.util.Map.Entry<com.jetbrains.jetpad.vclang.term.context.binding.Binding, java.lang.Integer> entry : level.myVars.entrySet()) {
            add(myVars, entry.getKey(), entry.getValue());
        }
    }
}