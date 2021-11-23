public boolean isPendingCall(final int i) {
    if ((mNestingRelation[i]) == (de.uni_freiburg.informatik.ultimate.automata.nestedword.NestedWord.PLUS_INFINITY)) {
        return true;
    }else {
        return false;
    }
}