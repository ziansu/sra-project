@java.lang.Override
public void execute() {
    if ((privateChatDialog) == null) {
        log("Please create private dialog first");
    }
    com.quickblox.chat.model.QBChatMessage status = new com.quickblox.chat.model.QBChatMessage();
    status.setId("267477ab5612312312414124");
    status.setDialogId("267477ab5612312312414124");
    try {
        privateChatDialog.deliverMessage(status);
    } catch (org.jivesoftware.smack.XMPPException | org.jivesoftware.smack.SmackException e) {
        log(("deliver message error: " + (e.getLocalizedMessage())));
    }
}