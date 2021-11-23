public java.util.List<com.flockathon.chat4u.ChatMessage> getMessages(java.lang.String requestId) {
    if (_chatMessageStoreSharedPrefs.contains(requestId)) {
        java.lang.String chatMessagesString = _chatMessageStoreSharedPrefs.getString(requestId, "");
        java.util.List<com.flockathon.chat4u.ChatMessage> chatMessageList = _gson.fromJson(chatMessagesString, type);
        android.util.Log.d("yyy", ("SIZE : " + (chatMessageList.size())));
        return chatMessageList;
    }
    return new java.util.ArrayList<>();
}