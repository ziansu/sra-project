@java.lang.Override
public se.majp.caseManagement.model.Issue addIssue(se.majp.caseManagement.model.Issue issue) {
    if ((issue.getIssueId()) == null) {
        issue = new se.majp.caseManagement.model.Issue(idGenerator.getNextId(), issue.getTitle(), issue.getDescription());
        return issueRepository.save(issue);
    }
    throw new se.majp.caseManagement.exception.BadRequestException("Issue already added, use update instead");
}