@java.lang.Override
public void onMessageReceipt(com.avoscloud.chat.service.chat.AVIMTypedMessage message, com.avoscloud.chat.service.chat.AVIMConversation conversation, com.avoscloud.chat.service.chat.AVIMClient client) {
    com.avoscloud.chat.service.chat.IM.im.onMessageReceipt(message, conversation);
}