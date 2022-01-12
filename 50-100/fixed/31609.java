@java.lang.Override
public void onServiceDisconnected(android.content.ComponentName componentName) {
    try {
        android.os.Message message = android.os.Message.obtain(null, Constants.CLIENT_UNREGISTER);
        message.replyTo = messageReceiver;
        messageSender.send(message);
    } catch (android.os.RemoteException exception) {
        exception.printStackTrace();
    }
    isDataMapServiceBound = false;
}