public java.util.HashMap<de.uni_freiburg.informatik.ultimate.logic.TermVariable, de.uni_freiburg.informatik.ultimate.logic.Term> constructAuxVarMapping(final java.util.Set<de.uni_freiburg.informatik.ultimate.logic.TermVariable> auxVars) {
    final java.util.HashMap<de.uni_freiburg.informatik.ultimate.logic.TermVariable, de.uni_freiburg.informatik.ultimate.logic.Term> result = new java.util.HashMap<>();
    for (final de.uni_freiburg.informatik.ultimate.logic.TermVariable auxVar : auxVars) {
        final de.uni_freiburg.informatik.ultimate.logic.Term auxVarConst = getOrConstructConstForAuxVar(auxVar);
        result.put(auxVar, auxVarConst);
    }
    return result;
}