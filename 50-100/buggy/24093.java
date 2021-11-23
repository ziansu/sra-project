@java.lang.Override
public org.apache.airavata.gfac.core.cluster.RawCommandInfo getJobIdMonitorCommand(java.lang.String jobName, java.lang.String userName) {
    return new org.apache.airavata.gfac.core.cluster.RawCommandInfo((((((((this.installedPath) + (jobManagerCommands.get(JobManagerCommand.JOB_MONITORING))) + " -u ") + userName) + " -f  | grep \"Job_Name = ") + jobName) + "\" -B1"));
}