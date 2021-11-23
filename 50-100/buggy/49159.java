@org.jvnet.hudson.test.Bug(value = 4177)
public void testTestFailureInEarlyTaskSegment() throws java.lang.Exception {
    configureDefaultMaven();
    org.eclipse.hudson.legacy.maven.plugin.MavenModuleSet m = createMavenProject();
    m.setGoals("clean install findbugs:findbugs");
    m.setScm(new org.jvnet.hudson.test.ExtractResourceSCM(getClass().getResource("maven-test-failure-findbugs.zip")));
    assertBuildStatus(Result.UNSTABLE, m.scheduleBuild2(0).get());
}