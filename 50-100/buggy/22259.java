@java.lang.Override
public void onQueryReturned(com.criptext.monkeychatandroid.models.MessageItem result) {
    if (result != null) {
        markMessageAsDelivered(oldId, read);
        updateConversationByMessage(result, read);
    }else
        if ((messageType == (java.lang.Integer.parseInt(MessageTypes.MOKText))) || (messageType == (java.lang.Integer.parseInt(MessageTypes.MOKFile)))) {
            sendSync();
        }
    
}