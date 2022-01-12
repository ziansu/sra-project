@java.lang.Override
public void visit(compiler.phase.seman.WhereExpr whereExpr) {
    whereExpr.expr.accept(this);
    compiler.phase.seman.Typ typ = attrs.typAttr.get(whereExpr);
    compiler.phase.seman.Typ tmp = attrs.typAttr.get(whereExpr.expr);
    if (typ == null)
        attrs.typAttr.set(whereExpr, tmp);
    
}