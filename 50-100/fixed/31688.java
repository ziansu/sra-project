public void sh(java.util.Collection<java.lang.String> output, java.lang.String... commands) {
    if (!(isValid))
        return ;
    
    try {
        shellProcess.exitValue();
        isValid = false;
        return ;
    } catch (java.lang.IllegalThreadStateException ignored) {
    }
    synchronized(shellProcess) {
        com.topjohnwu.magisk.utils.StreamGobbler out = new com.topjohnwu.magisk.utils.StreamGobbler(STDOUT, output);
        out.start();
        sh_raw(commands);
        sh_raw("echo \'-shell-done-\'");
        try {
            out.join();
        } catch (java.lang.InterruptedException ignored) {
        }
    }
}