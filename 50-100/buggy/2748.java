private static java.util.List<org.sosy_lab.solver.api.BooleanFormula> checkedCast(java.util.List<org.sosy_lab.solver.api.Formula> list) {
    java.util.List<org.sosy_lab.solver.api.BooleanFormula> ret = new java.util.ArrayList(list.size());
    for (org.sosy_lab.solver.api.Formula f : list) {
        if (f instanceof org.sosy_lab.solver.api.BooleanFormula) {
            ret.add(((org.sosy_lab.solver.api.BooleanFormula) (list)));
        }else {
            throw new java.lang.IllegalStateException("Non-boolean formula where only boolean formulas should occur");
        }
    }
    return ret;
}