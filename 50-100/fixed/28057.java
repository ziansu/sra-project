@java.lang.Override
public void execute(com.github.eirslett.maven.plugins.frontend.lib.FrontendPluginFactory factory) throws com.github.eirslett.maven.plugins.frontend.lib.TaskRunnerException {
    java.io.File packageJson = new java.io.File(workingDirectory, "package.json");
    if ((((buildContext) == null) || (buildContext.hasDelta(packageJson))) || (!(buildContext.isIncremental()))) {
        com.github.eirslett.maven.plugins.frontend.lib.ProxyConfig proxyConfig = getProxyConfig();
        factory.getNpmRunner(proxyConfig, getRegistryUrl()).execute(arguments, environmentVariables);
    }else {
        getLog().info("Skipping npm install as package.json unchanged");
    }
}