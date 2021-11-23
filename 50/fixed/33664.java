public static void deleteContestTeamMember(java.lang.Long contestTeamMemberId) {
    org.xcolab.client.contest.ContestClient.contestTeamMemberResource.delete(contestTeamMemberId).execute();
}