protected boolean canInline(com.hp.hpl.jena.sparql.expr.Expr e) {
    if (e == null)
        return false;
    
    return com.hp.hpl.jena.sparql.expr.ExprLib.isStable(e);
}