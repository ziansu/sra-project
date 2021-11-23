@org.junit.Test
public void verifyView_runTest_success() throws java.lang.Exception {
    org.mockito.Mockito.when(testConfig.getEnvironment().getExecMode()).thenReturn(ExecMode.RUN_TEST);
    org.mockito.Mockito.when(testResultManager.getPersister().loadTargetResults(org.mockito.Matchers.any(com.htmlhifive.pitalium.core.io.PersistMetadata.class))).thenReturn(screenshotResult.getTargetResults());
    assertionView.verifyView(com.htmlhifive.pitalium.core.model.ScreenshotArgument.builder("ssid").build());
    org.junit.Assert.assertTrue(true);
}