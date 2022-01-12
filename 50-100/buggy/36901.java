public static java.util.Map<de.uni_freiburg.informatik.ultimate.logic.TermVariable, de.uni_freiburg.informatik.ultimate.logic.Term> constructAuxVarMapping(final java.util.Set<de.uni_freiburg.informatik.ultimate.logic.TermVariable> auxVars, final de.uni_freiburg.informatik.ultimate.modelcheckerutils.boogie.VariableManager varManager) {
    if (auxVars.isEmpty()) {
        return java.util.Collections.emptyMap();
    }else {
        final java.util.Map<de.uni_freiburg.informatik.ultimate.logic.TermVariable, de.uni_freiburg.informatik.ultimate.logic.Term> result = new java.util.HashMap<>();
        for (final de.uni_freiburg.informatik.ultimate.logic.TermVariable auxVar : auxVars) {
            final de.uni_freiburg.informatik.ultimate.logic.Term auxVarConst = varManager.constructFreshConstant(auxVar);
            result.put(auxVar, auxVarConst);
        }
        return result;
    }
}