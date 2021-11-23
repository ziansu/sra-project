@java.lang.Override
public void clearThreadHeadSelfReference() {
    nu.yona.server.messaging.entities.Message threadHeadMessage = getThreadHeadMessage();
    if ((threadHeadMessage == null) || ((threadHeadMessage.getId()) != (getId()))) {
        return ;
    }
    super.clearThreadHeadSelfReference();
    if ((senderCopyMessage) != null) {
        senderCopyMessage.clearThreadHeadSelfReference();
    }
    if ((buddyMessage) != null) {
        buddyMessage.clearThreadHeadSelfReference();
    }
}