public static java.lang.Integer runCli(java.lang.String workingDir) throws java.lang.Exception {
    java.util.Properties testProperties = org.commonjava.maven.ext.manip.CliTestUtils.loadTestProps(workingDir);
    return org.commonjava.maven.ext.manip.CliTestUtils.runCli(testProperties, workingDir);
}