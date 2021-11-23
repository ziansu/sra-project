private static java.lang.String getWorkingDirectory(hudson.model.Slave slave) {
    java.lang.String workingDirectory = slave.getRemoteFS();
    while (workingDirectory.endsWith("/")) {
        workingDirectory = workingDirectory.substring(0, ((workingDirectory.length()) - 1));
    } 
    return workingDirectory;
}