@java.lang.Override
public void messagesAdded(final javax.mail.event.MessageCountEvent e) {
    try {
        java.lang.System.err.println(("Message Added: " + (e.getMessages()[0].getSubject())));
        showNotification(e.getMessages()[0]);
    } catch (javax.mail.MessagingException ex) {
    }
}