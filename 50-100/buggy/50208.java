private hudson.plugins.sauce_ondemand.FreeStyleBuild runFreestyleBuild(hudson.plugins.sauce_ondemand.SauceOnDemandBuildWrapper sauceBuildWrapper, org.jvnet.hudson.test.TestBuilder builder) throws java.lang.Exception {
    hudson.plugins.sauce_ondemand.FreeStyleProject freeStyleProject = jenkinsRule.createFreeStyleProject();
    freeStyleProject.getBuildWrappersList().add(sauceBuildWrapper);
    freeStyleProject.getBuildersList().add(builder);
    hudson.model.queue.QueueTaskFuture<hudson.plugins.sauce_ondemand.FreeStyleBuild> future = freeStyleProject.scheduleBuild2(0);
    hudson.plugins.sauce_ondemand.FreeStyleBuild build = future.get(1, java.util.concurrent.TimeUnit.MINUTES);
    org.junit.Assert.assertNotNull(build);
    return build;
}