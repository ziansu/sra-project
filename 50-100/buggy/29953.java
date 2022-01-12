private void recordComment(int lineno) {
    if ((scannedComments) == null) {
        scannedComments = new java.util.ArrayList<org.mozilla.javascript.Comment>();
    }
    java.lang.String comment = ts.getAndResetCurrentComment();
    org.mozilla.javascript.Comment commentNode = new org.mozilla.javascript.Comment(ts.tokenBeg, ts.getTokenLength(), ts.commentType, comment);
    if (((ts.commentType) == (Token.CommentType.JSDOC)) && (compilerEnv.isRecordingLocalJsDocComments())) {
        currentJsDocComment = commentNode;
    }
    commentNode.setLineno(lineno);
    scannedComments.add(commentNode);
}