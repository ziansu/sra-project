@java.lang.Override
public void exitMainfunc(grammar.CracklParser.MainfuncContext ctx) {
    analysis.Scope removeScope = scopes.get(((scopes.size()) - 1));
    java.lang.System.out.println("Main func Scope: ");
    java.lang.System.out.println(removeScope);
    scopes.remove(((scopes.size()) - 1));
    result.addScope(ctx, removeScope);
    result.addNode(ctx);
}