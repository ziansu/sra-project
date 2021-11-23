public boolean handleChatMsg(int ID, socket.Message msg) {
    if (msg.getType().equals("Chat")) {
        findUserThread(msg.getRecipient()).send(msg);
    }
    return false;
}