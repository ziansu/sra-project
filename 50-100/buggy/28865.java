@com.google.inject.Provides
com.github.pockethub.core.issue.IssueStore issueStore(org.eclipse.egit.github.core.service.IssueService issueService, org.eclipse.egit.github.core.service.PullRequestService pullService) {
    com.github.pockethub.core.issue.IssueStore store = ((issues) != null) ? issues.get() : null;
    if (store == null) {
        store = new com.github.pockethub.core.issue.IssueStore(issueService, pullService);
        issues = new java.lang.ref.WeakReference(store);
    }
    return store;
}