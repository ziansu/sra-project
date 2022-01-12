public void shutdown() {
    if ((sendSystem) != null) {
        sendSystem.shutdown();
        sendSystem = null;
    }
    if ((receiveThread) != null) {
        receiveThread.interrupt();
        receiveThread = null;
    }
    if ((combinedAudioExecutor) != null) {
        combinedAudioExecutor.shutdownNow();
        combinedAudioExecutor = null;
    }
}