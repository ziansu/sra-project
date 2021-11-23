public void refresh() {
    conversationList = loadConversationsWithRecentChat();
    handler.sendEmptyMessage(MSG_REFRESH_ADAPTER_DATA);
}