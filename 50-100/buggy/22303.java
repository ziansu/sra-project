public java.lang.Boolean validateIssueCommentUI(com.softserverinc.edu.entities.IssueComment issueComment) {
    if (!(issueComment.getAnonymousName().equals(PageConstant.EMPTY_STRING))) {
        int anonymousNameLength = issueComment.getAnonymousName().length();
        return (anonymousNameLength >= (com.softserverinc.edu.constants.PageConstant.MIN_ANONYM_NAME_LENGTH)) && (anonymousNameLength <= (com.softserverinc.edu.constants.PageConstant.MAX_ANONYM_NAME_LENGTH));
    }
    return true;
}