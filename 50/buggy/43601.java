@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    com.easemob.chatuidemo.activity.ChatActivity.activityInstance = null;
    com.easemob.chat.EMChatManager.getInstance().removeGroupChangeListener(groupListener);
}