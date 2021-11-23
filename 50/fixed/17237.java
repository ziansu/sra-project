private org.jboss.set.aphrodite.domain.Issue associateCommentsToIssue(org.jboss.set.aphrodite.domain.Issue issue, java.util.Map<java.lang.String, java.util.List<org.jboss.set.aphrodite.domain.Comment>> comments) {
    issue.setComments(comments.get(issue.getTrackerId().get()));
    return issue;
}