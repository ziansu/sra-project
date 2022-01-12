public de.uni_freiburg.informatik.ultimate.logic.Term[] getInterpolants(de.uni_freiburg.informatik.ultimate.logic.Term proofTree) {
    colorLiterals(proofTree, new java.util.HashSet<de.uni_freiburg.informatik.ultimate.logic.Term>());
    final de.uni_freiburg.informatik.ultimate.smtinterpol.interpolate.Interpolant[] eqitps = interpolate(proofTree);
    final de.uni_freiburg.informatik.ultimate.logic.Term[] itpTerms = new de.uni_freiburg.informatik.ultimate.logic.Term[eqitps.length];
    for (int i = 0; i < (eqitps.length); i++) {
        itpTerms[i] = unfoldLAs(eqitps[i]);
    }
    return itpTerms;
}