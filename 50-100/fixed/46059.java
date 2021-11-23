private de.uni_freiburg.informatik.ultimate.modelcheckerutils.smt.arrays.ArrayIndex processArrayIndex(final de.uni_freiburg.informatik.ultimate.modelcheckerutils.smt.arrays.ArrayIndex arrayIndex, final de.uni_freiburg.informatik.ultimate.lassoranker.variables.TransFormulaLR transformula, final de.uni_freiburg.informatik.ultimate.modelcheckerutils.smt.equalityanalysis.EqualityAnalysisResult invariants) {
    final java.util.List<de.uni_freiburg.informatik.ultimate.logic.Term> list = new java.util.ArrayList<>();
    for (final de.uni_freiburg.informatik.ultimate.logic.Term t : arrayIndex) {
        list.add(process(t, transformula, invariants));
    }
    return new de.uni_freiburg.informatik.ultimate.modelcheckerutils.smt.arrays.ArrayIndex(list);
}