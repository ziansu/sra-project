@java.lang.Override
public void execute() {
    if ((privateChatDialog) == null) {
        log("Please create private dialog first");
    }
    privateChatDialog.addIsTypingListener(privateChatDialogTypingListener);
    try {
        privateChatDialog.sendIsTypingNotification();
    } catch (org.jivesoftware.smack.XMPPException | org.jivesoftware.smack.SmackException e) {
        log(("send typing error: " + (e.getClass().getSimpleName())));
    }
}