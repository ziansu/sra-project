public java.util.Set<org.sosy_lab.solver.api.BooleanFormula> performWeakening(java.util.Map<org.sosy_lab.solver.api.BooleanFormula, org.sosy_lab.solver.api.BooleanFormula> selectionInfo, org.sosy_lab.solver.api.BooleanFormula fromState, org.sosy_lab.cpachecker.util.predicates.pathformula.PathFormula transition, org.sosy_lab.solver.api.BooleanFormula toState) throws java.lang.InterruptedException, org.sosy_lab.solver.SolverException {
    try {
        statistics.cexWeakeningTime.start();
        return counterexampleBasedWeakening0(selectionInfo, fromState, transition, toState);
    } finally {
        statistics.cexWeakeningTime.stop();
    }
}