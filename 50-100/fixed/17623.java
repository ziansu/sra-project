public void execute() throws org.apache.maven.plugin.MojoExecutionException, org.apache.maven.plugin.MojoFailureException {
    final org.eobjects.build.PluginHelper helper = getPluginHelper();
    for (java.io.File subDirectory : helper.getProjectDirectories()) {
        if (!(new java.io.File(subDirectory, "project.lock.json").exists())) {
            helper.executeCommand(subDirectory, "dotnet", "restore");
        }
        helper.executeCommand(subDirectory, "dotnet", "build");
    }
}