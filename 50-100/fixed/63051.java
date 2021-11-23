public void printIssues() {
    int totalIssueCount = rootIssueScope.getTotalIssueCount();
    if (totalIssueCount == 0) {
        return ;
    }
    errorOut.print("some issues were detected while generating bean classes [");
    errorOut.print(totalIssueCount);
    errorOut.println(" issues]");
    printScopeIssues(rootIssueScope, 0, errorOut);
}