static java.util.Collection<java.lang.String> findIssueKeys(java.lang.String input) {
    java.util.Collection<java.lang.String> ids = new java.util.ArrayList<>();
    java.util.regex.Matcher m = io.jenkins.blueocean.blueocean_github_pipeline.GithubIssue.PATTERN.matcher(input);
    while (m.find()) {
        if ((m.groupCount()) >= 1) {
            java.lang.String issue = m.group(1);
            ids.add(issue.substring(1, issue.length()));
        }
    } 
    return ids;
}