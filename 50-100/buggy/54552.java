public java.util.List<cz.softinel.retra.jiraintegration.JiraIssue> findJiraIssuesForUser(java.lang.String ldapLogin) {
    java.util.List<cz.softinel.retra.jiraintegration.JiraIssue> result = null;
    if (isJiraEnabled()) {
        result = jiraConnector.findIssuesForWorklog(ldapLogin);
        if ((jiraConfig.getJiraCache()) != null) {
            for (cz.softinel.retra.jiraintegration.JiraIssue issue : result) {
                jiraConfig.getJiraCache().addIssueToCache(issue);
            }
        }
    }
    return result;
}