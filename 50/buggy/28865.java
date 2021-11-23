protected boolean canInline(com.hp.hpl.jena.sparql.expr.Expr e) {
    return com.hp.hpl.jena.sparql.expr.ExprLib.isStable(e);
}