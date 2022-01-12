@java.lang.Override
public polyglot.ast.Node typeCheckOverride(polyglot.ast.Node parent, polyglot.visit.TypeChecker tc) throws polyglot.types.SemanticException {
    polyglot.ast.Case c = node();
    polyglot.ast.Expr expr = c.expr();
    if ((expr == null) || (expr instanceof polyglot.ast.Lit)) {
        return null;
    }
    return c;
}