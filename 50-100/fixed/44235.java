@java.lang.Override
public org.apache.airavata.gfac.core.cluster.RawCommandInfo getJobIdMonitorCommand(java.lang.String jobName, java.lang.String userName) {
    return new org.apache.airavata.gfac.core.cluster.RawCommandInfo(((((((this.installedPath) + (jMCommands.get(JobManagerCommand.JOB_MONITORING).trim())) + " -n ") + jobName) + " -u ") + userName));
}