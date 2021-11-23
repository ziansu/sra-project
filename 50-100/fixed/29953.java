private void recordComment(int lineno, java.lang.String comment) {
    if ((scannedComments) == null) {
        scannedComments = new java.util.ArrayList<org.mozilla.javascript.Comment>();
    }
    org.mozilla.javascript.Comment commentNode = new org.mozilla.javascript.Comment(ts.tokenBeg, ts.getTokenLength(), ts.commentType, comment);
    if (((ts.commentType) == (Token.CommentType.JSDOC)) && (compilerEnv.isRecordingLocalJsDocComments())) {
        currentJsDocComment = commentNode;
    }
    commentNode.setLineno(lineno);
    scannedComments.add(commentNode);
}