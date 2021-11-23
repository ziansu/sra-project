@org.junit.Test
public void testIsTestRunRequiredForTestInDebugMode() throws java.io.IOException, java.lang.InterruptedException, java.util.concurrent.ExecutionException {
    com.facebook.buck.step.ExecutionContext executionContext = org.easymock.EasyMock.createMock(com.facebook.buck.step.ExecutionContext.class);
    org.easymock.EasyMock.expect(executionContext.isDebugEnabled()).andReturn(true);
    org.easymock.EasyMock.replay(executionContext);
    org.junit.Assert.assertTrue(("In debug mode, test should always run regardless of any cached results since " + "the user is expecting to hook up a debugger."), com.facebook.buck.cli.TestRunning.isTestRunRequiredForTest(org.easymock.EasyMock.createMock(com.facebook.buck.rules.TestRule.class), org.easymock.EasyMock.createMock(com.facebook.buck.rules.CachingBuildEngine.class), executionContext, org.easymock.EasyMock.createMock(com.facebook.buck.cli.TestRuleKeyFileHelper.class), true));
    org.easymock.EasyMock.verify(executionContext);
}