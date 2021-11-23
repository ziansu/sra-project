@java.lang.Override
public void messageReceived(ch.hsr.navigationmessagingapi.NavigationMessage message) {
    application.showToastMessage(message.getMessageType());
    switch (message.getMessageType()) {
        case ch.hsr.navigationmessagingapi.MessageTypes.PositionRequest :
            findLocationAndRespond();
            break;
        default :
            break;
    }
}