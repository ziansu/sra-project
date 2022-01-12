public static java.util.List<java.lang.Long> getRoleForContestTeam(java.lang.Long contestId, java.lang.Long roleId) {
    java.util.Map<java.lang.Long, java.util.List<java.lang.Long>> teamRoleToUsersMap = org.xcolab.client.contest.ContestClient.getContestTeamMembersByRole(contestId);
    java.util.List<java.lang.Long> members = teamRoleToUsersMap.get(roleId);
    if (members == null) {
        return new java.util.ArrayList<>();
    }else {
        return members;
    }
}