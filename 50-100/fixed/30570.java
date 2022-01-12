public <STATE> de.uni_freiburg.informatik.ultimate.automata.nwalibrary.DNFAsBitSetList rewriteWithNewStateList(final java.util.ArrayList<STATE> oldStateList, final java.util.Map<STATE, java.lang.Integer> newStateToIndex) {
    de.uni_freiburg.informatik.ultimate.automata.nwalibrary.DNFAsBitSetList current = new de.uni_freiburg.informatik.ultimate.automata.nwalibrary.DNFAsBitSetList(this);
    do {
        current.mAlpha = rewriteBitSet(mAlpha, oldStateList, newStateToIndex);
        current = current.mNext;
    } while (current != null );
    return null;
}