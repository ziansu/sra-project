public int updateTeamInformation() {
    int count = 0;
    java.util.List<com.capitalone.dashboard.model.Team> teams = jiraClient.getTeams();
    if (org.apache.commons.collections.CollectionUtils.isNotEmpty(teams)) {
        updateMongoInfo(teams);
        count += teams.size();
    }else {
        java.util.List<com.atlassian.jira.rest.client.api.domain.BasicProject> projects = jiraClient.getProjects();
        if (org.apache.commons.collections.CollectionUtils.isNotEmpty(projects)) {
            updateMongoInfoLegacy(projects);
            count += projects.size();
        }
    }
    return count;
}