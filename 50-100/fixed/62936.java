public void execute() throws org.apache.maven.plugin.MojoExecutionException, org.apache.maven.plugin.MojoFailureException {
    getLog().info("Adding /src/main/groovy to the list of source folders");
    project.addCompileSourceRoot(((project.getBasedir()) + "/src/main/groovy"));
    getLog().info("Adding /src/test/groovy to the list of test source folders");
    project.addTestCompileSourceRoot(((project.getBasedir()) + "/src/test/groovy"));
}