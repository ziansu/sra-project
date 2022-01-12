private void updateCandidates() {
    java.util.ArrayList<java.lang.String> words = this.mKeyData.searchRecord(new java.lang.String(this.charbuffer, 0, this.strokecount));
    if (words.isEmpty()) {
        setCandidatesViewShown(false);
    }else {
        this.mCandidateView.setSuggestion(words);
        setCandidatesViewShown(true);
    }
}