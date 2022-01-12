@java.lang.Override
public boolean onPushMsg(android.content.Context context, byte[] msg, android.os.Bundle bundle) {
    try {
        java.lang.String content = "收到一条Push消息： " + (new java.lang.String(msg, "UTF-8"));
        android.util.Log.d(PustDemoActivity.TAG, content);
        showPushMessage(PustDemoActivity.RECEIVE_PUSH_MSG, content);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return false;
}