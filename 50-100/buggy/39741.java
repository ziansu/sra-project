public void addComment(java.lang.String comment, boolean resolve) {
    java.lang.Integer oldStatusId = issue.getStatusId();
    try {
        issue.setNotes(comment);
        if (resolve) {
            issue.setStatusId(3);
            getRepository().getIssueManager().update(issue);
        }
        return ;
    } catch (com.taskadapter.redmineapi.RedmineException | java.lang.RuntimeException ex) {
        com.kenai.redminenb.util.ExceptionHandler.handleException(com.kenai.redminenb.issue.RedmineIssue.LOG, "Can't add comment for a Redmine issue", ex);
    }
    issue.setStatusId(oldStatusId);
}