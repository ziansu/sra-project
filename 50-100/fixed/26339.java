@java.lang.Override
public void sendMessageFromUIAdapter(java.lang.String messageString, java.lang.String otherParticipant, java.lang.String appSource) {
    if (!(conversationReady)) {
        startEncryptionProcess(otherParticipant, appSource);
        return ;
    }
    uiAdapter.waitForProcessing();
    long time = new java.util.Date().getTime();
    this.uiMessageDateToForward = time;
    xyz.encryptany.encryptany.interfaces.Message payload = messageFactory.createNewMessage(messageString, otherParticipant, appSource, uiMessageDateToForward);
    archiveMessage(payload);
    encryptionAdapter.encryptMessage(payload);
}