@java.lang.Override
public void run() {
    try {
        io.fabric8.maven.core.util.ProcessUtil.processOutput(process.getInputStream(), io.fabric8.maven.core.util.ProcessUtil.createOutputHandler(log));
    } catch (java.io.IOException e) {
        log.error("Failed to read output stream from %s : %s", commandDesc, e.getMessage());
    }
}