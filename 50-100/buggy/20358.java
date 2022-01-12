private com.thoughtworks.go.domain.BuildCommand constructClient(java.lang.String workingDir, java.lang.String clientName) {
    java.lang.String clientArgs = (((((((("Client: " + clientName) + "\n\n") + "Root: ") + (new java.io.File(workingDir).getAbsolutePath())) + "\n\n") + "Options: clobber rmdir\n\n") + "LineEnd: local\n\n") + "View:\n") + (material.p4view(clientName));
    return exec("p4", "client", "-i").setExecInput(clientArgs).setCommandEnvVars(envVars());
}