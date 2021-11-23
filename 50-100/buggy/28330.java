private void createUserConfig(com.careydevelopment.twitterautomation.jpa.entity.TwitterUser u) {
    com.careydevelopment.twitterautomation.jpa.entity.UserConfig uc = new com.careydevelopment.twitterautomation.jpa.entity.UserConfig();
    uc.setMaxProjects(Constants.DEFAULT_MAX_PROJECTS);
    uc.setMaxUrlsPerProject(Constants.DEFAULT_MAX_URLS_PER_PROJECT);
    uc.setCurrentRefreshes(0);
    uc.setMaxRefreshes(Constants.DEFAULT_MAX_REFRESHES);
    uc.setRefreshDate(new java.util.Date());
    uc.setUser(u);
    userConfigRepository.save(uc);
}