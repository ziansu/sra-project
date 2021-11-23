public static unification.Expression clauseForm(unification.Expression E) throws java.io.IOException {
    E = cnf.CNF.eliminateDoubleImplication(E);
    E = cnf.CNF.eliminateImplication(E);
    E = cnf.CNF.pushNegationInwards(E, false);
    java.lang.System.out.println(E);
    E = cnf.CNF.Standardize(E);
    java.lang.System.out.println(E);
    E = cnf.CNF.Skolemize(E);
    E = cnf.CNF.discardUniversalQuantifiers(E);
    E = cnf.CNF.translateIntoCNF(E);
    return E;
}