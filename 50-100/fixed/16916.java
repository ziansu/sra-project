@edu.umd.cs.findbugs.annotations.CheckForNull
private static java.lang.String getWorkingDirectory(@edu.umd.cs.findbugs.annotations.CheckForNull
hudson.model.Slave slave) {
    if (slave == null) {
        return null;
    }
    java.lang.String workingDirectory = slave.getRemoteFS();
    while (workingDirectory.endsWith("/")) {
        workingDirectory = workingDirectory.substring(0, ((workingDirectory.length()) - 1));
    } 
    return workingDirectory;
}