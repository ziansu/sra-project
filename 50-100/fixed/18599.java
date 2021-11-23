public java.util.List<zeyt.hotfix.jira.JiraTicket> searchJql() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
    zeyt.hotfix.jira.Promise<zeyt.hotfix.jira.SearchResult> resultPromise = this.searchRestClient.searchJql(this.jql);
    for (zeyt.hotfix.jira.BasicIssue issue : resultPromise.get().getIssues()) {
        java.lang.String key = issue.getKey();
        java.lang.System.out.println(key);
    }
    return java.util.Collections.emptyList();
}