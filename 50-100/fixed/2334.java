public void execute() throws org.apache.maven.plugin.MojoExecutionException, org.apache.maven.plugin.MojoFailureException {
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
    in.mayurshah.util.EnvVarToFile envVarToFile = new in.mayurshah.util.EnvVarToFile();
    envVarToFile.write();
}