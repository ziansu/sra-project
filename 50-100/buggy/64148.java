public hudson.util.ListBoxModel doFillFieldKeyItems(@org.kohsuke.stapler.QueryParameter
@hudson.RelativePath(value = "..")
java.lang.String projectKey, @org.kohsuke.stapler.QueryParameter
@hudson.RelativePath(value = "..")
java.lang.String issueType) {
    org.jenkinsci.plugins.JiraTestResultReporter.JiraTestDataPublisher.JiraTestDataPublisherDescriptor jiraDescriptor = org.jenkinsci.plugins.JiraTestResultReporter.JiraUtils.getJiraDescriptor();
    if ((projectKey == "") || (issueType == ""))
        return new hudson.util.ListBoxModel();
    
    try {
        return jiraDescriptor.getCacheEntry(projectKey, issueType).getStringFieldBox();
    } catch (java.lang.NullPointerException e) {
        return new hudson.util.ListBoxModel();
    }
}