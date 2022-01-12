@com.google.inject.Provides
com.github.pockethub.core.issue.IssueStore issueStore(android.content.Context context) {
    com.github.pockethub.core.issue.IssueStore store = ((issues) != null) ? issues.get() : null;
    if (store == null) {
        store = new com.github.pockethub.core.issue.IssueStore(context);
        issues = new java.lang.ref.WeakReference(store);
    }
    return store;
}