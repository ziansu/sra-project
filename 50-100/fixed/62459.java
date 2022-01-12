private int build(java.io.ByteArrayOutputStream stdout, java.io.PrintStream printOut) throws java.io.IOException {
    java.lang.String command = findCommand();
    printOut.println(java.lang.String.format("Starting build with command '%s'", command));
    org.apache.commons.exec.CommandLine cmdLine = org.apache.commons.exec.CommandLine.parse(command);
    org.apache.commons.exec.DefaultExecutor executable = new org.apache.commons.exec.DefaultExecutor();
    executable.setWorkingDirectory(repository.getDirectory().getParentFile());
    executable.setStreamHandler(new org.apache.commons.exec.PumpStreamHandler(stdout));
    return executable.execute(cmdLine);
}