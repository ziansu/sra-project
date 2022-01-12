protected void gitPush(final java.lang.String branchName, boolean pushTags) throws org.apache.maven.plugin.MojoFailureException, org.codehaus.plexus.util.cli.CommandLineException {
    getLog().info(((((("Pushing '" + branchName) + "' branch") + " to '") + (gitFlowConfig.getOrigin())) + "'."));
    if (pushTags) {
        executeGitCommand("push", "--quiet", "--tags", gitFlowConfig.getOrigin(), branchName);
    }else {
        executeGitCommand("push --quiet", gitFlowConfig.getOrigin(), branchName);
    }
}