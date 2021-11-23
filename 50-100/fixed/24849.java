private wyal.lang.Proof.State instantiateIndexAxiom(wyal.lang.WyalFile.Expr.Polynomial index, wyal.lang.Proof.State state, wyal.lang.Formula... dependencies) {
    wyal.lang.WyalFile.Expr.Polynomial zero = new wyal.lang.WyalFile.Expr.Polynomial(java.math.BigInteger.ZERO);
    wyal.lang.Formula axiom = wyal.util.Formulae.simplifyFormula(wyal.util.Formulae.greaterOrEqual(index, zero), types);
    return state.infer(this, state.allocate(axiom), dependencies);
}