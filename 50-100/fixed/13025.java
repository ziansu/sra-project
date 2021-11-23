static ddejonge.ggp.sat.logic.CNF disjunctCNFwithLiteral(ddejonge.ggp.sat.logic.CNF cnf, boolean positive, ddejonge.ggp.sat.logic.Proposition p) {
    ddejonge.ggp.sat.logic.CNF newCnf = new ddejonge.ggp.sat.logic.CNF();
    for (ddejonge.ggp.sat.logic.Clause clause : cnf) {
        ddejonge.ggp.sat.logic.Clause newClause = new ddejonge.ggp.sat.logic.Clause(clause.getPositiveAtoms(), clause.getNegativeAtoms());
        newClause.addLiteral(p, positive);
        newCnf.add(newClause);
    }
    return newCnf;
}