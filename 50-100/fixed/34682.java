@org.junit.Test
public void runMavenBuild_InvocationFailed() throws java.lang.Exception {
    final org.apache.maven.shared.invoker.MavenInvocationException expected = new org.apache.maven.shared.invoker.MavenInvocationException("anyMessage");
    doThrow(expected).when(invoker).execute(request);
    try {
        phaseInvoker.runMavenBuild(reactor);
        org.junit.Assert.fail("Exception expected here");
    } catch (final org.apache.maven.plugin.MojoExecutionException e) {
        org.junit.Assert.assertSame(expected, e.getCause());
    }
}