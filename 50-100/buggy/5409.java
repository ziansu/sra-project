private void sendMessage() {
    java.lang.String content = messageEditText.getText().toString().trim();
    if (!(content.equals(""))) {
        repository.addMessage(new com.homeservice.mickeycj.chatwithbot.model.Message(com.homeservice.mickeycj.chatwithbot.ChatFragment.IS_USER, com.homeservice.mickeycj.chatwithbot.ChatFragment.USER_NAME, content));
        socket.emit("new message", content);
        hideSoftKeyboard();
        updateChat();
    }
}