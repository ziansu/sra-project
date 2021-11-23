@java.lang.Override
public org.apache.airavata.gfac.core.cluster.RawCommandInfo getCancelCommand(java.lang.String jobID) {
    return new org.apache.airavata.gfac.core.cluster.RawCommandInfo(((((this.installedPath) + (jobManagerCommands.get(JobManagerCommand.DELETION))) + " ") + jobID));
}