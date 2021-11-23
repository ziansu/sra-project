@java.lang.Override
public void execute() throws org.apache.maven.plugin.MojoExecutionException, org.apache.maven.plugin.MojoFailureException {
    verifyAppEngineStandardApp();
    getAppEngineFactory().devServerRunSync().run(this);
}