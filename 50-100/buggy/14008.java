private static com.puppycrawl.tools.checkstyle.api.DetailAST getPrevStatementFromSwitchBlock(com.puppycrawl.tools.checkstyle.api.DetailAST comment) {
    com.puppycrawl.tools.checkstyle.api.DetailAST prevStmt = null;
    final com.puppycrawl.tools.checkstyle.api.DetailAST parentStatement = comment.getParent();
    if (parentStatement != null) {
        if ((parentStatement.getType()) == (com.puppycrawl.tools.checkstyle.api.TokenTypes.CASE_GROUP)) {
            prevStmt = com.puppycrawl.tools.checkstyle.checks.indentation.CommentsIndentationCheck.getPrevStatementWhenCommentIsUnderCase(parentStatement);
        }else {
            prevStmt = com.puppycrawl.tools.checkstyle.checks.indentation.CommentsIndentationCheck.getPrevCaseToken(parentStatement);
        }
    }
    return prevStmt;
}