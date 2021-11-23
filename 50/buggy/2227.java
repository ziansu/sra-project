private static void terminatePresto() throws com.teradata.prestomanager.agent.PrestoManagerException {
    int prestoTerminate = com.teradata.prestomanager.agent.CommandExecutor.executeCommand("service", "presto", "stop");
    if (prestoTerminate != 0) {
        throw new com.teradata.prestomanager.agent.PrestoManagerException("Failed to stop presto", prestoTerminate);
    }
}