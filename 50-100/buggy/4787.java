public void sendMessage() {
    java.lang.String message = messageText.getText().toString();
    int userID = prefs.getInt(MainActivity.USER_KEY, (-1));
    if (userID == (-1)) {
        return ;
    }
    appendToMessageHistory("You", message);
    new com.dblappdev.hitch.network.API().insertChatMessage(userID, com.dblappdev.hitch.app.ChatActivity.CHAT_ID, message, null);
}