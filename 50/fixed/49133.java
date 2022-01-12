@java.lang.Override
public void onPause() {
    super.onPause();
    com.wenjiehe.xingji.Im.NotificationUtils.removeTag(imConversation.getConversationId());
}