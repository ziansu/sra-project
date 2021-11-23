public void leave() {
    inChannel = false;
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
    db = null;
}