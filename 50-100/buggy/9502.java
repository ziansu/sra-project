public void close(net.dv8tion.jda.core.audio.hooks.ConnectionStatus closeStatus) {
    if ((sendSystem) != null)
        sendSystem.shutdown();
    
    if ((receiveThread) != null)
        receiveThread.interrupt();
    
    if ((combinedAudioExecutor) != null)
        combinedAudioExecutor.shutdownNow();
    
    webSocket.close(closeStatus);
}