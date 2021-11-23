private void init() {
    com.easemob.chat.EMContactManager.getInstance().setContactListener(new com.easemob.chatuidemo.activity.MainActivity.MyContactListener());
    connectionListener = new com.easemob.chatuidemo.activity.MainActivity.MyConnectionListener();
    com.easemob.chat.EMChatManager.getInstance().addConnectionListener(connectionListener);
    com.easemob.chat.EMGroupManager.getInstance().addGroupChangeListener(new com.easemob.chatuidemo.activity.MainActivity.MyGroupChangeListener());
    registerInternalDebugReceiver();
}