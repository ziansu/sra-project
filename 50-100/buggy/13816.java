public void setAudioConnection(net.dv8tion.jda.core.audio.AudioConnection audioConnection) {
    this.audioConnection = audioConnection;
    if (audioConnection == null)
        return ;
    
    this.queuedAudioConnection = null;
    audioConnection.setSendingHandler(sendHandler);
    audioConnection.setReceivingHandler(receiveHandler);
    audioConnection.setQueueTimeout(queueTimeout);
    audioConnection.ready(timeout);
}