@java.lang.Override
public java.lang.Iterable<? extends com.atlassian.jira.rest.client.domain.BasicIssue> getIssues() {
    java.util.Collections.sort(issues, basicIssueComparator);
    java.util.ArrayList<? extends com.atlassian.jira.rest.client.domain.BasicIssue> copy = new java.util.ArrayList<>(issues);
    if (!(issues.isEmpty())) {
        issues.remove(0);
    }
    return copy;
}