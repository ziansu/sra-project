@java.lang.Override
public void sendMsgToServer(java.lang.String msg) {
    try {
        if ((msg != null) && ((msg.length()) > 0)) {
            sendMsg(msg);
        }
    } catch (java.lang.Exception e) {
        android.util.Log.e(TAG, ("sendMsgToServer exception: " + (e.getMessage())));
    }
}