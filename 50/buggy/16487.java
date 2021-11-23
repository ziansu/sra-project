@java.lang.Override
public int consolidateDuplicateIssues(burp.IScanIssue existingIssue, burp.IScanIssue newIssue) {
    if ((existingIssue.getIssueDetail()) == (newIssue.getIssueDetail())) {
        return -1;
    }else {
        return 0;
    }
}