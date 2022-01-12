private wyal.lang.Proof.State instantiateLengthAxiom(wyal.lang.WyalFile.Expr.Polynomial index, wyal.lang.WyalFile.Expr.Polynomial length, wyal.lang.Proof.State state, wyal.lang.Formula... dependencies) {
    wyal.lang.Formula axiom = wyal.util.Formulae.simplifyFormula(wyal.util.Formulae.lessThan(index, length), types);
    return state.infer(this, state.allocate(axiom), dependencies);
}