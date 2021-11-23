@java.lang.Override
public void exitAssignStat(grammar.CracklParser.AssignStatContext ctx) {
    analysis.Scope curScope = scopes.get(((scopes.size()) - 1));
    analysis.Type lhsType = getType(ctx.target());
    checkType(ctx.expr(), lhsType);
    curScope.addInitVar(ctx.getText());
}