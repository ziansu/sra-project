private void writeCurrentRunInfo(edu.illinois.nondex.plugin.CleanSurefireExecution execution) {
    try {
        java.nio.file.Files.write(this.executions.get(0).getConfiguration().getRunFilePath(), ((execution.getConfiguration().executionId) + (java.lang.String.format("%n"))).getBytes(), java.nio.file.StandardOpenOption.CREATE, java.nio.file.StandardOpenOption.APPEND);
    } catch (java.io.IOException ex) {
        edu.illinois.nondex.common.Logger.getGlobal().log(java.util.logging.Level.SEVERE, "Cannot write execution id to current run file", ex);
    }
}