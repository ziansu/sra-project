private boolean isDisequalityLiteral(final de.uni_freiburg.informatik.ultimate.smtinterpol.util.SymmetricPair<de.uni_freiburg.informatik.ultimate.smtinterpol.theory.cclosure.CCTerm> termPair) {
    if (mEqualityLiterals.containsKey(termPair)) {
        if ((mEqualityLiterals.get(termPair).getSign()) > 0) {
            return true;
        }
    }
    return false;
}