@java.lang.Override
public void done(java.util.List<com.avos.avoscloud.im.v2.AVIMMessage> serverMessages, com.avos.avoscloud.im.v2.AVIMException e) {
    if (e != null) {
        callback.internalDone(e);
    }else {
        if (serverMessages == null) {
            serverMessages = new java.util.ArrayList<com.avos.avoscloud.im.v2.AVIMMessage>();
        }
        continuousMessages.addAll(serverMessages);
        processContinuousMessages(continuousMessages);
        callback.internalDone(continuousMessages, null);
    }
}