@java.lang.Override
protected void configureSpecificCompilerArguments(@org.jetbrains.annotations.NotNull
org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments arguments) throws org.apache.maven.plugin.MojoExecutionException {
    module = testModule;
    classpath = testClasspath;
    arguments.friendPaths = new java.lang.String[]{ output };
    output = testOutput;
    moduleName = moduleName;
    super.configureSpecificCompilerArguments(arguments);
}