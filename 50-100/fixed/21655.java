@java.lang.Override
public boolean onPushMsg(android.content.Context context, byte[] msg, android.os.Bundle bundle) {
    try {
        java.lang.String content = "收到一条Push消息： " + (new java.lang.String(msg, "UTF-8"));
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return false;
}