public se.meer.jpa.model.Issue createOrUpdateIssue(se.meer.jpa.model.Issue issue) {
    return issueRepository.save(issue);
}