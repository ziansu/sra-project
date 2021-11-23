private de.uni_freiburg.informatik.ultimate.util.datastructures.Doubleton<de.uni_freiburg.informatik.ultimate.logic.Term> constructDefiningDoubleton(final de.uni_freiburg.informatik.ultimate.util.datastructures.Doubleton<de.uni_freiburg.informatik.ultimate.logic.Term> inVarDoubleton) {
    final de.uni_freiburg.informatik.ultimate.logic.Term oneElement = inVarDoubleton.getOneElement();
    final de.uni_freiburg.informatik.ultimate.logic.Term otherElement = inVarDoubleton.getOtherElement();
    final de.uni_freiburg.informatik.ultimate.logic.Term translatedOne = de.uni_freiburg.informatik.ultimate.modelcheckerutils.cfg.transitions.ModifiableTransFormulaUtils.translateTermVariablesToDefinitions(mScript, mTransFormula, oneElement);
    final de.uni_freiburg.informatik.ultimate.logic.Term translatedOther = de.uni_freiburg.informatik.ultimate.modelcheckerutils.cfg.transitions.ModifiableTransFormulaUtils.translateTermVariablesToDefinitions(mScript, mTransFormula, otherElement);
    return new de.uni_freiburg.informatik.ultimate.util.datastructures.Doubleton(translatedOne, translatedOther);
}