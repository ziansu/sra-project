private boolean checkForIssueComments(database.entity.JiraIssue issue) {
    java.lang.StringBuilder sb = issuesSimilarityCommentsCollector.collectIssueComments(issue);
    return (sb != null) && ((sb.toString().trim().length()) > 0);
}