@org.jetbrains.annotations.NotNull
@java.lang.Override
protected com.intellij.execution.process.ProcessHandler startProcess() throws com.intellij.execution.ExecutionException {
    com.thoughtworks.gauge.execution.GeneralCommandLine commandLine = new com.thoughtworks.gauge.execution.GeneralCommandLine();
    try {
        commandLine.setExePath(com.thoughtworks.gauge.util.GaugeUtil.getGaugeExecPath());
    } catch (com.thoughtworks.gauge.exception.GaugeNotFoundException e) {
        commandLine.setExePath(GaugeConstant.GAUGE);
    } finally {
        addFlags(commandLine, env);
        com.thoughtworks.gauge.execution.GaugeRunConfiguration.DebugInfo debugInfo = createDebugInfo(commandLine, env);
        return com.thoughtworks.gauge.execution.GaugeRunProcessHandler.runCommandLine(commandLine, debugInfo, getProject());
    }
}