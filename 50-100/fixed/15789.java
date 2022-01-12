protected int executeCommandLine(org.apache.commons.exec.Executor exec, org.apache.commons.exec.CommandLine commandLine, java.util.Map<java.lang.String, java.lang.String> enviro, java.io.FileOutputStream outputFile) throws java.io.IOException, org.apache.commons.exec.ExecuteException {
    java.io.BufferedOutputStream bos = new java.io.BufferedOutputStream(outputFile);
    org.apache.commons.exec.PumpStreamHandler psh = new org.apache.commons.exec.PumpStreamHandler(bos);
    return executeCommandLine(exec, commandLine, enviro, psh);
}