@java.lang.Override
public void execute() throws org.apache.maven.plugin.MojoExecutionException, org.apache.maven.plugin.MojoFailureException {
    verifyAppEngineStandardApp();
    workAroundNonJava7Version();
    getLog().info((("Waiting " + (startSuccessTimeout)) + " seconds for the Dev App Server to start."));
    getAppEngineFactory().devServerRunAsync(startSuccessTimeout).run(this);
    getLog().info("Dev App Server started.");
    getLog().info("Use the 'mvn appengine:stop' command to stop the server.");
}