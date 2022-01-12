@java.lang.Override
public void handleCallSessionEvent(int event) {
    mHandler.obtainMessage(android.telecom.VideoCallImpl.MessageHandler.MSG_HANDLE_CALL_SESSION_EVENT, event).sendToTarget();
}