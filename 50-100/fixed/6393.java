@java.lang.Override
public ru.homer.leaderboard.entity.IssueDto mapIssueDto(com.atlassian.jira.rest.client.api.domain.Issue issue) {
    ru.homer.leaderboard.entity.IssueDto issueDto = new ru.homer.leaderboard.entity.IssueDto();
    issueDto.setIdIssue(issue.getId());
    issueDto.setBasicProject(issue.getProject().getName());
    issueDto.setSummary(issue.getSummary());
    issueDto.setIssueType(issue.getIssueType());
    issueDto.setCreationDate(issue.getCreationDate());
    issueDto.setKey(issue.getKey());
    return issueDto;
}