@java.lang.Override
public void run() {
    callback.onMessageSendingSuccess(callId, content, contentTypeHeader);
}