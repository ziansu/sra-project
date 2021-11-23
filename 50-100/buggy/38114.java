protected int executeCommandLine(org.apache.commons.exec.Executor exec, org.apache.commons.exec.CommandLine commandLine, java.util.Map<java.lang.String, java.lang.String> enviro, java.io.OutputStream out, java.io.OutputStream err) throws java.io.IOException, org.apache.commons.exec.ExecuteException {
    org.apache.commons.exec.PumpStreamHandler psh = new org.apache.commons.exec.PumpStreamHandler(out, err, java.lang.System.in);
    exec.setStreamHandler(psh);
    int result;
    try {
        psh.start();
        result = exec.execute(commandLine, enviro);
    } finally {
        psh.stop();
    }
    return result;
}