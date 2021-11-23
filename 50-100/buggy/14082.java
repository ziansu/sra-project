public void leave() {
    inChannel = false;
    db = null;
    messageSenderThread.interrupt();
    messageSenderThread = null;
    messageSender = null;
    sendQueue.clear();
    messageReceiverThread.interrupt();
    messageReceiverThread = null;
    messageReceiver = null;
    receiveQueue.clear();
    commandCooldownSet.clear();
    userCooldownSet.clear();
    subscriberStorage.clear();
}