@java.lang.Override
public priv.bajdcc.LALR1.grammar.tree.Function getFuncByName(java.lang.String name) {
    priv.bajdcc.LALR1.grammar.tree.Function func = funcMap.get(name);
    if (func != null) {
        return func;
    }
    for (priv.bajdcc.LALR1.grammar.tree.Function function : funcMap.list) {
        java.lang.String funcName = function.getRealName();
        if ((funcName != null) && (funcName.equals(name))) {
            return function;
        }
    }
    return null;
}