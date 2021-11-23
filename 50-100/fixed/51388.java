protected void initVariables() {
    talkToWho = getIntent().getStringExtra("talkWithWho").toLowerCase();
    setTitle((("与 " + (talkToWho)) + " 对话中"));
    com.hyphenate.chat.EMConversation conversation = com.hyphenate.chat.EMClient.getInstance().chatManager().getConversation(talkToWho);
    if (conversation != null)
        conversation.markAllMessagesAsRead();
    
}