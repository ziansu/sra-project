private de.uni_freiburg.informatik.ultimate.modelcheckerutils.smt.arrays.ArrayIndex getLocalIndex(final de.uni_freiburg.informatik.ultimate.modelcheckerutils.smt.arrays.ArrayIndex globalIndex, final de.uni_freiburg.informatik.ultimate.lassoranker.variables.TransFormulaLR transformula, final java.util.Set<de.uni_freiburg.informatik.ultimate.logic.Term> assignedVars, final boolean returnInVar) {
    final java.util.List<de.uni_freiburg.informatik.ultimate.logic.Term> list = new java.util.ArrayList<>();
    for (final de.uni_freiburg.informatik.ultimate.logic.Term t : globalIndex) {
        list.add(getLocalTerm(t, transformula, assignedVars, returnInVar));
    }
    return new de.uni_freiburg.informatik.ultimate.modelcheckerutils.smt.arrays.ArrayIndex(list);
}