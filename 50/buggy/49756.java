public static hudson.FilePath getProjectWorkspaceOnMaster(hudson.model.AbstractBuild build, java.io.PrintStream logger) {
    return com.michelin.cio.hudson.plugins.copytoslave.CopyToSlaveUtils.getProjectWorkspaceOnMaster(build.getProject(), logger);
}