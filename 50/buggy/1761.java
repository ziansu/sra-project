public Concrete.Expression visitExpr(com.jetbrains.jetpad.vclang.parser.ExprContext expr) {
    if (expr == null)
        return null;
    
    return ((com.jetbrains.jetpad.vclang.term.Concrete.Expression) (visit(expr)));
}