protected boolean shouldInline(com.hp.hpl.jena.sparql.expr.Expr e) {
    if (e == null)
        return false;
    
    if (this.aggressive)
        return true;
    
    return (e.isConstant()) || (e instanceof com.hp.hpl.jena.sparql.expr.NodeValue);
}