@java.lang.Override
public void handleMessage(android.os.Message inputMessage) {
    org.mobicents.restcomm.android.client.sdk.SignalingMessage message = ((org.mobicents.restcomm.android.client.sdk.SignalingMessage) (inputMessage.obj));
    if ((message.type) == (SignalingMessage.MessageType.OPEN_REPLY)) {
        listener.onOpenReply(message.id, message.successful, message.text);
    }else
        if ((message.type) == (SignalingMessage.MessageType.CALL_REPLY)) {
        }else
            if ((message.type) == (SignalingMessage.MessageType.CALL_EVENT)) {
            }
        
    
}