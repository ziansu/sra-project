@java.lang.Override
public org.apache.airavata.gfac.core.cluster.RawCommandInfo getSubmitCommand(java.lang.String workingDirectory, java.lang.String forkFilePath) {
    return new org.apache.airavata.gfac.core.cluster.RawCommandInfo(((((((this.installedPath) + (jobManagerCommands.get(JobManagerCommand.SUBMISSION))) + " ") + workingDirectory) + (java.io.File.separator)) + (org.apache.commons.io.FilenameUtils.getName(forkFilePath))));
}