public static java.lang.Integer runCli(java.util.List<java.lang.String> args, java.util.Map<java.lang.String, java.lang.String> params, java.lang.String workingDir) throws java.lang.Exception {
    java.lang.String stringArgs = org.commonjava.maven.ext.manip.CliTestUtils.toArguments(args);
    java.lang.String stringParams = org.commonjava.maven.ext.manip.CliTestUtils.toJavaParams(params);
    java.lang.String command = java.lang.String.format("java -jar %s/pom-manipulation-cli.jar %s %s", org.commonjava.maven.ext.manip.CliTestUtils.BUILD_DIR, stringParams, stringArgs);
    return org.commonjava.maven.ext.manip.CliTestUtils.runCommandAndWait(command, workingDir);
}