private com.couchbase.lite.DocumentChange changeWithNewRevision(com.couchbase.lite.internal.RevisionInternal inRev, boolean isWinningRev, com.couchbase.cbforest.Document doc, java.net.URL source) {
    java.lang.String winningRevID;
    if (isWinningRev)
        winningRevID = inRev.getRevID();
    else {
        winningRevID = doc.getSelectedRevID();
    }
    return new com.couchbase.lite.DocumentChange(inRev, winningRevID, doc.conflicted(), source);
}