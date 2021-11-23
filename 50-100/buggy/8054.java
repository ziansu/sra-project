@java.lang.Override
public void call(java.lang.Object... args) {
    java.lang.String receivedMessage = ((java.lang.String) (args[0]));
    if (receivedMessage.equals("fail")) {
    }else {
        mSocket.emit("add_user", receivedMessage, ownerId);
        mSocket.on(receivedMessage, messageReceiver);
        mSocket.emit("get_recent_group_messages", ownerId, 20);
    }
    android.util.Log.d("GROUPFUNCTION", receivedMessage);
}