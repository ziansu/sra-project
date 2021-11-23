public void stop() throws java.io.IOException {
    nodeManagerReaderRunnable.destroy();
    checkingRunnable.destroy();
    for (log.ContainerLogReader logReader : runningContainerMap.values()) {
        logReader.stop();
    }
}