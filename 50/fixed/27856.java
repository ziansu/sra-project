protected boolean tryMatchConflicting(java.util.List<java.util.List<com.onpositive.text.analysis.IToken>> sequences) {
    for (java.util.List<com.onpositive.text.analysis.IToken> curSequence : sequences) {
        if (!(matchedNonConflict(euristics, curSequence))) {
            return false;
        }
    }
    return true;
}