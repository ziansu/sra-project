private static void updateSubtaskRelation(controllers.Issue issue, controllers.Issue originalIssue) {
    if (org.apache.commons.lang3.StringUtils.isEmpty(issue.parentIssueId)) {
        issue.parent = null;
    }else {
        issue.parent = Issue.finder.byId(java.lang.Long.valueOf(issue.parentIssueId));
    }
    originalIssue.parent = issue.parent;
    originalIssue.update();
}