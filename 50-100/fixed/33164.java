private void updateCandidates() {
    java.util.ArrayList<java.lang.String> words;
    if ((this.charbuffer.length) > 0) {
        words = this.mKeyData.searchRecord(new java.lang.String(this.charbuffer, 0, this.strokecount));
    }else {
        words = new java.util.ArrayList<java.lang.String>();
    }
    if (words.isEmpty()) {
        setCandidatesViewShown(false);
    }else {
        this.mCandidateView.setSuggestion(words);
        setCandidatesViewShown(true);
    }
}