public void shutdown() {
    com.opera.core.systems.runner.launcher.OperaLauncherRunner.logger.fine("Shutting down launcher");
    try {
        launcherProtocol.sendRequestWithoutResponse(MessageType.MSG_SHUTDOWN, null);
    } catch (java.io.IOException e) {
    }
    try {
        launcherProtocol.shutdown();
    } catch (java.io.IOException e) {
        throw new com.opera.core.systems.runner.OperaRunnerException("Unable to shut down launcher", e);
    }
    if ((launcherRunner) != null) {
        launcherRunner.shutdown();
        launcherRunner = null;
    }
}