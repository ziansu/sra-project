public void discardSegments(long startTxId) throws java.io.IOException {
    storage.getJournalManager().discardSegments(startTxId);
    committedTxnId.set((startTxId - 1));
}