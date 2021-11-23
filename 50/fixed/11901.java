@org.junit.Test(expected = org.apache.maven.plugin.MojoExecutionException.class)
public void runMavenBuild_ErrorExitCode() throws java.lang.Exception {
    when(result.getExitCode()).thenReturn(1);
    phaseInvoker.runMavenBuild(reactor);
}