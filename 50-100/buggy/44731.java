public void process(java.util.List<com.techlooper.model.UserImportData> users) {
    for (com.techlooper.model.UserImportData user : users) {
        processUserEmail(user);
        com.techlooper.service.impl.GitHubUserImportDataProcessor.extractUserSkillSetFromDescription(user);
        processUserFollowers(user);
        processUserFollowing(user);
        processUserContributedLongStreakDays(user);
        processUserContributedNumberLastYear(user);
    }
}