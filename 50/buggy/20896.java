public void reloadConfiguration() {
    org.codinjutsu.tools.jenkins.view.BrowserPanel browserPanel = org.codinjutsu.tools.jenkins.view.BrowserPanel.getInstance(project);
    browserPanel.reloadConfiguration();
    browserPanel.initScheduledJobs(scheduledThreadPoolExecutor);
    org.codinjutsu.tools.jenkins.logic.RssLogic.getInstance(project).initScheduledJobs(scheduledThreadPoolExecutor);
}