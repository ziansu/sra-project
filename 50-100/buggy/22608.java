org.parboiled.Rule ArraySubscript() {
    org.parboiled.support.Var<org.teavm.flavour.templates.expr.Expr<java.lang.Void>> array = new org.parboiled.support.Var();
    org.parboiled.support.Var<org.teavm.flavour.templates.expr.Expr<java.lang.Void>> index = new org.parboiled.support.Var();
    return Sequence(Primitive(), array.set(pop()), Keyword("["), Expression(), index.set(pop()), Keyword("]"), push(new org.teavm.flavour.templates.expr.BinaryExpr(array.get(), index.get(), BinaryOperation.GET_ELEMENT)), setLocations);
}