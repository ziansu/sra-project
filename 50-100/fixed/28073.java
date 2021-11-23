@java.lang.Override
public void sendEvent(final java.lang.String receiver, final android.content.Intent event) {
    if ((receiver == null) || ((receiver.length()) <= 0)) {
        mEventSender.execute(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                sendEventToWebSocket(event);
            }
        });
    }else {
        super.sendEvent(receiver, event);
    }
}