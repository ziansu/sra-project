private void loadNewIssue() {
    this.setAllButtonEnable(false);
    this.lastIssueCount = this.issueLoader.getIssues().size();
    this.issueLoader.loadNewIssues();
}