@java.lang.Override
public boolean handleMessage(android.os.Message msg) {
    switch (msg.what) {
        case edu.rit.se.crashavoidance.MainActivity.MESSAGE_READ :
            byte[] readBuf = ((byte[]) (msg.obj));
            java.lang.String readMessage = new java.lang.String(readBuf, 0, msg.arg1);
            android.util.Log.d(edu.rit.se.crashavoidance.MainActivity.SERVICE_NAME, readMessage);
            break;
        case edu.rit.se.crashavoidance.MainActivity.MY_HANDLE :
            java.lang.Object obj = msg.obj;
            chatFragment.setChatManager(((edu.rit.se.crashavoidance.ChatManager) (obj)));
    }
    return true;
}