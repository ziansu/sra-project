@java.lang.Override
public priv.bajdcc.LALR1.grammar.tree.Function getFuncByName(java.lang.String name) {
    priv.bajdcc.LALR1.grammar.tree.Function func = funcMap.get(name);
    if (func != null) {
        return func;
    }
    int count = 0;
    for (priv.bajdcc.LALR1.grammar.tree.Function function : funcMap.list) {
        java.lang.String funcName = function.getRealName();
        if ((funcName != null) && (funcName.equals(name))) {
            func = function;
            count++;
        }
    }
    return count == 1 ? func : null;
}