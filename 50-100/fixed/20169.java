public int updateTeamInformation() {
    int count = 0;
    java.util.List<com.capitalone.dashboard.model.Team> teams = jiraClient.getTeams();
    if (org.apache.commons.collections.CollectionUtils.isNotEmpty(teams)) {
        updateMongoInfo(teams);
        count += teams.size();
    }
    return count;
}