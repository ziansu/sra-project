@java.lang.Override
public void messageReceived(ch.hsr.navigationmessagingapi.NavigationMessage message) {
    switch (message.getMessageType()) {
        case ch.hsr.navigationmessagingapi.MessageTypes.PositionRequest :
            findLocationAndRespond();
            break;
        default :
            break;
    }
}