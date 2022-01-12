@java.lang.Override
public at.searles.meelan.Tree eval(java.util.List<at.searles.meelan.Tree> arguments) {
    if ((arguments.size()) == 2) {
        at.searles.meelan.Tree fun = arguments.get(0);
        at.searles.meelan.Tree var = arguments.get(1);
        at.searles.meelan.Tree dfun = at.searles.meelan.Op.derive.eval(arguments);
        at.searles.meelan.Tree t = at.searles.meelan.Op.sub.eval(var, at.searles.meelan.Op.div.eval(fun, dfun));
        return t;
    }
    return new at.searles.meelan.Tree.OpApp(this, arguments);
}