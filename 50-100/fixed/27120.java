private void check(final java.io.File workingDir, final java.util.List<java.io.File> filesToAdd, final java.lang.String expectedArguments) {
    final org.codehaus.plexus.util.cli.Commandline cl = org.apache.maven.scm.provider.git.gitexe.command.GitCommandLineUtils.getBaseGitCommandLine(workingDir, "add");
    org.apache.maven.scm.provider.git.gitexe.command.GitCommandLineUtils.addTarget(cl, filesToAdd);
    final java.lang.String arguments = java.util.Arrays.toString(cl.getArguments());
    org.junit.Assert.assertEquals((1 + (filesToAdd.size())), cl.getArguments().length);
    org.junit.Assert.assertEquals(expectedArguments, arguments);
}