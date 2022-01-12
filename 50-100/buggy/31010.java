@java.lang.Override
public void send(Message msg) {
    for (int i = 0; i < (clientUsers.size()); i++) {
        User receiverUser = clientUsers.get(i);
        java.net.Socket receiverSocket = socketPool.get(i);
        msg = handleOutMsg(msg, receiverUser);
        sendToUser(msg, receiverUser, receiverSocket);
    }
}