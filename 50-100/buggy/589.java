public void setFromIssue(com.tpb.projects.data.models.Issue issue) {
    requiresLoadingFromIssue = false;
    note = ((issue.getTitle()) + "\n") + (((issue.getBody()) != null) && (!(issue.getBody().isEmpty())) ? '\n' + (issue.getBody()) : "");
    this.issue = issue;
}