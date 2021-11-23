public com.dabsquared.gitlabjenkins.testhelpers.ProjectSetupResult createProject(final org.jvnet.hudson.test.JenkinsRule jenkins, final java.lang.String gitRepoUrl) throws java.io.IOException {
    final hudson.model.FreeStyleProject testProject = jenkins.createFreeStyleProject("test");
    testProject.setScm(new hudson.plugins.git.GitSCM(gitRepoUrl));
    testProject.setQuietPeriod(0);
    final com.dabsquared.gitlabjenkins.testhelpers.BuildNotifier buildNotifier = addNotifier(testProject);
    return new com.dabsquared.gitlabjenkins.testhelpers.ProjectSetupResult(testProject, buildNotifier);
}