@java.lang.Override
public long getSenderId() {
    if (((senderId) == 0) && ((senderPublicKey) != null)) {
        senderId = nxt.Account.getId(senderPublicKey);
    }
    return senderId;
}