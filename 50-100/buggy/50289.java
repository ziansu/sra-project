static org.jboss.set.aphrodite.domain.IssueStatus getAphroditeStatus(java.lang.String status) {
    status = status.toLowerCase();
    org.jboss.set.aphrodite.domain.IssueStatus issueStatus = org.jboss.set.aphrodite.issue.trackers.jira.JiraFields.STATUS_MAP.get(status);
    if (issueStatus == null) {
        switch (status) {
            case "new" :
            case "reopened" :
                return org.jboss.set.aphrodite.domain.IssueStatus.NEW;
            case "qa in progress" :
                return org.jboss.set.aphrodite.domain.IssueStatus.ON_QA;
            default :
                return org.jboss.set.aphrodite.domain.IssueStatus.UNDEFINED;
        }
    }
    return issueStatus;
}