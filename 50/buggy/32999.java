@java.lang.Override
public java.lang.Process call() throws java.lang.Exception {
    java.lang.Process process = new org.netbeans.api.extexecution.ExternalProcessBuilder("C:\\Users\\gwieleng\\AppData\\Roaming\\npm\\yo.cmd").addArgument(selectedGenerator).workingDirectory(dirF).call();
    dialogProcessor.setWriter(new java.io.OutputStreamWriter(process.getOutputStream()));
    return process;
}