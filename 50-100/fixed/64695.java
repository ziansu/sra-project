private de.uni_freiburg.informatik.ultimate.modelcheckerutils.smt.arrays.ArrayIndex getLocalIndex(final de.uni_freiburg.informatik.ultimate.modelcheckerutils.smt.arrays.ArrayIndex globalIndex, final de.uni_freiburg.informatik.ultimate.lassoranker.variables.TransFormulaLR transformula, final boolean returnInVar) {
    final java.util.List<de.uni_freiburg.informatik.ultimate.logic.Term> list = new java.util.ArrayList<>();
    for (final de.uni_freiburg.informatik.ultimate.logic.Term t : globalIndex) {
        list.add(getLocalTerm(t, transformula, returnInVar));
    }
    return new de.uni_freiburg.informatik.ultimate.modelcheckerutils.smt.arrays.ArrayIndex(list);
}