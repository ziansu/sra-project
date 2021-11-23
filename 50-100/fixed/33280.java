public void spreadMessages() {
    while ((com.fortuna.stargate.msg.MessageCenter.messagesBuffer.size()) > 0) {
        synchronized(com.fortuna.stargate.msg.MessageCenter.bufferLock) {
            java.util.LinkedList<com.fortuna.stargate.msg.Message> messagesSwap = com.fortuna.stargate.msg.MessageCenter.messagesBuffer;
            com.fortuna.stargate.msg.MessageCenter.messagesBuffer = com.fortuna.stargate.msg.MessageCenter.messages;
            com.fortuna.stargate.msg.MessageCenter.messages = messagesSwap;
            com.fortuna.stargate.msg.MessageCenter.subscribers.addAll(com.fortuna.stargate.msg.MessageCenter.subscribersBuffer);
            com.fortuna.stargate.msg.MessageCenter.subscribersBuffer.clear();
        }
        com.fortuna.stargate.msg.Message nextMessage;
        while ((nextMessage = com.fortuna.stargate.msg.MessageCenter.messages.poll()) != null) {
            for (com.fortuna.stargate.behaviour.Subscriber sub : com.fortuna.stargate.msg.MessageCenter.subscribers) {
                sub.handleMessage(nextMessage);
            }
        } 
    } 
}