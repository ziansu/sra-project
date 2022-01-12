@java.lang.Override
public polyglot.ast.Node checkConstants(polyglot.visit.ConstantChecker cc) throws polyglot.types.SemanticException {
    polyglot.ast.Case c = node();
    polyglot.ast.Expr expr = c.expr();
    if (expr == null)
        return c;
    
    if (!(cc.lang().constantValueSet(expr, cc.lang())))
        return c;
    
    if (expr instanceof polyglot.ext.jl5.ast.EnumConstant)
        return c;
    
    return superLang().checkConstants(node(), cc);
}