public void sendMessage(java.lang.String jabberId, at.usmile.cormorant.framework.messaging.CormorantMessage cormorantMessage) {
    try {
        org.jivesoftware.smack.chat2.ChatManager chatManager = org.jivesoftware.smack.chat2.ChatManager.getInstanceFor(connection);
        chatManager.addIncomingListener(this);
        org.jxmpp.jid.EntityBareJid receiver = org.jxmpp.jid.impl.JidCreate.entityBareFrom(jabberId);
        org.jivesoftware.smack.chat2.Chat chat = chatManager.chatWith(receiver);
        chat.send(createMessage(cormorantMessage));
    } catch (org.jivesoftware.smack.SmackException | org.jxmpp.stringprep.XmppStringprepException | java.lang.InterruptedException e) {
        android.util.Log.e(at.usmile.cormorant.framework.messaging.MessagingService.LOG_TAG, e.getMessage(), e);
    }
}