@java.lang.Override
public void analyse() {
    super.analyse();
    if ((expr) != null) {
        if (!(((ashc.grammar.Node) (expr)).errored)) {
            final ashc.semantics.Semantics.TypeI type = ashc.grammar.Semantics.filterNullType(expr.getExprType());
            var = new ashc.semantics.Member.Variable(id, type);
            ashc.grammar.Semantics.addVar(var);
            analyseProperty(type);
        }
    }
}