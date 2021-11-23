private void handleFallThroughtSingleLineComment(com.puppycrawl.tools.checkstyle.api.DetailAST prevStmt, com.puppycrawl.tools.checkstyle.api.DetailAST comment, com.puppycrawl.tools.checkstyle.api.DetailAST nextStmt) {
    if (!(com.puppycrawl.tools.checkstyle.checks.indentation.CommentsIndentationCheck.areSameLevelIndented(comment, prevStmt, nextStmt))) {
        logMultilineIndentation(prevStmt, comment, nextStmt);
    }
}