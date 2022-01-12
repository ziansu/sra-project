@org.jvnet.hudson.test.Bug(value = 14438)
@org.junit.Test
public void testMatrixUserCause() throws java.lang.Exception {
    org.jenkins_ci.plugins.run_condition.core.FreeStyleProject upProject = createFreeStyleProject("secondProject");
    org.jenkins_ci.plugins.run_condition.core.FreeStyleBuild upBuild = upProject.scheduleBuild2(0).get();
    org.jenkins_ci.plugins.run_condition.core.Cause upstreamCause = new hudson.model.Cause.UpstreamCause(upBuild);
    org.jenkins_ci.plugins.run_condition.core.Cause userCause = createUserCause("testUser");
    org.jenkins_ci.plugins.run_condition.RunCondition condition = new org.jenkins_ci.plugins.run_condition.core.CauseCondition("USER_CAUSE", false);
    runMatrixTest(upstreamCause, condition, false);
    runMatrixTest(userCause, condition, true);
}