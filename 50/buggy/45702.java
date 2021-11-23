@java.lang.Override
protected void execute() {
    roverPlatformClient.getFrontCamera().commandStreaming(true);
}