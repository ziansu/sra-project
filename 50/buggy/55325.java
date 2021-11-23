@java.lang.Override
public long getSenderId() {
    if ((senderId) == 0) {
        senderId = nxt.Account.getId(senderPublicKey);
    }
    return senderId;
}