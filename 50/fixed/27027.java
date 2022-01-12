public boolean handleChatMsg(int ID, socket.Message msg) {
    findUserThread(msg.getRecipient()).send(msg);
    return false;
}