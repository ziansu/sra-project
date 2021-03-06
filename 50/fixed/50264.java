@org.junit.Test
public void runMavenBuild_WithUserSettings() throws java.lang.Exception {
    phaseInvoker.setUserSettings(de.hilling.maven.release.PhaseInvokerTest.USER_SETTINGS);
    phaseInvoker.runMavenBuild(reactor);
    verify(request).setUserSettingsFile(de.hilling.maven.release.PhaseInvokerTest.USER_SETTINGS);
}