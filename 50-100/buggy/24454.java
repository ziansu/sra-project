public void stop() throws java.io.IOException {
    if ((commandExecutorThread) == null) {
        return ;
    }
    commandExecutorThread.interrupt();
    execThreadGroup.interrupt();
    execThreadGroup.destroy();
    try {
        commandExecutorThread.join(1000);
    } catch (java.lang.InterruptedException e) {
    }
    commandExecutorThread = null;
    execThreadGroup = null;
}