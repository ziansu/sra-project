@java.lang.Override
public org.sosy_lab.solver.api.BooleanFormula visitAnd(java.util.List<org.sosy_lab.solver.api.BooleanFormula> processed) {
    return bfmgr.and(bfmgr.toConjunctionArgs(bfmgr.and(processed), true));
}