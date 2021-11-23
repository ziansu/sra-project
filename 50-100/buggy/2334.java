public void execute() throws org.apache.maven.plugin.MojoExecutionException, org.apache.maven.plugin.MojoFailureException {
    in.mayurshah.util.EnvVarToFile envVarToFile = new in.mayurshah.util.EnvVarToFile();
    verifyEnvVariableExists(Const.suiteName);
    verifyEnvVariableExists(Const.ReportLocation);
    verifyEnvVariableExists(Const.remoteURL);
    verifyEnvVariableExists(Const.baseURL);
    verifyEnvVariableExists(Const.internal);
    verifyEnvVariableExists(Const.parallel);
    verifyEnvVariableExists(Const.thread_count);
    verifyEnvVariableExists(Const.tests);
    verifyEnvVariableExists(Const.browsers);
    verifyEnvVariableExists(Const.packageName);
    envVarToFile.write();
}