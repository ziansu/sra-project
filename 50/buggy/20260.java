private void addProjectClasspath(com.thoughtworks.gauge.execution.GeneralCommandLine commandLine) {
    com.intellij.openapi.module.Module module = getModule();
    if (module != null)
        commandLine.getEnvironment().put(com.thoughtworks.gauge.execution.GaugeRunConfiguration.GAUGE_CUSTOM_CLASSPATH, com.thoughtworks.gauge.util.GaugeUtil.classpathForModule(module));
    
}