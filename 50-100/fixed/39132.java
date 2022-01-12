@java.lang.Override
public void exitMainfunc(grammar.CracklParser.MainfuncContext ctx) {
    analysis.Scope removeScope = scopes.get(((scopes.size()) - 1));
    scopes.remove(((scopes.size()) - 1));
    result.addScope(ctx, removeScope);
    result.addNode(ctx);
}