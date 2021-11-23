@java.lang.Override
public void run() {
    de.cinovo.cloudconductor.agent.jobs.DirectoriesJob.LOGGER.debug("Started Directory Job");
    if (AgentState.directoryExecutionLock.tryLock()) {
        try {
            new de.cinovo.cloudconductor.agent.jobs.handler.DirectoryHandler().run();
        } catch (de.cinovo.cloudconductor.agent.exceptions.ExecutionError e) {
            if ((e.getCause()) instanceof de.cinovo.cloudconductor.api.lib.exceptions.CloudConductorException) {
                de.cinovo.cloudconductor.agent.jobs.DirectoriesJob.LOGGER.debug(e.getMessage(), e);
            }
        } finally {
            AgentState.filesExecutionLock.unlock();
        }
    }
    de.cinovo.cloudconductor.agent.jobs.DirectoriesJob.LOGGER.debug("finished Directory Job");
}