public <STATE> de.uni_freiburg.informatik.ultimate.automata.nwalibrary.DNFAsBitSetList rewriteWithNewStateList(final java.util.ArrayList<STATE> oldStateList, final java.util.HashMap<STATE, java.lang.Integer> newStateToIndex) {
    final de.uni_freiburg.informatik.ultimate.automata.nwalibrary.DNFAsBitSetList newDNF = new de.uni_freiburg.informatik.ultimate.automata.nwalibrary.DNFAsBitSetList(this);
    de.uni_freiburg.informatik.ultimate.automata.nwalibrary.DNFAsBitSetList current = newDNF;
    while (current != null) {
        current.mAlpha = rewriteBitSet(mAlpha, oldStateList, newStateToIndex);
        current = current.mNext;
    } 
    return null;
}