private void exo(final org.logicng.datastructures.EncodingResult result, final org.logicng.formulas.Variable... vars) {
    if ((vars.length) == 0)
        return ;
    
    if ((vars.length) == 1) {
        result.addClause(vars[0]);
        return ;
    }
    this.amo(result, vars);
    result.addClause(((org.logicng.formulas.Literal[]) (vars)));
}