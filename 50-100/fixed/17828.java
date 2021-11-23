public void saveIfNonExists(ru.sidvi.graylog.api.IssueDTO issue, java.lang.String serverUrl, java.lang.String apiKey) {
    ru.sidvi.graylog.api.RedmineClient client = factory.create(serverUrl, apiKey);
    java.lang.String projectIdentifier = issue.getProjectIdentifier();
    java.util.List<ru.sidvi.graylog.api.IssueDTO> projectIssues = client.getAll(projectIdentifier);
    if (!(isExists(issue, projectIssues))) {
        client.create(marker.append(issue));
    }
}