protected boolean shouldInline(com.hp.hpl.jena.sparql.expr.Expr e) {
    if (this.aggressive)
        return true;
    
    if (e == null)
        return false;
    
    return (e.isConstant()) || (e instanceof com.hp.hpl.jena.sparql.expr.NodeValue);
}