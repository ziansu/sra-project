public void forceStopTask() {
    closeSocket();
    executorService.shutdownNow();
}