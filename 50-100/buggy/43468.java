@java.lang.Override
public void messagesAdded(final javax.mail.event.MessageCountEvent e) {
    try {
        log.info(("Message Added: " + (e.getMessages()[0].getSubject())));
        showNotification(e.getMessages()[0]);
    } catch (javax.mail.MessagingException ex) {
        log.error("Error: ", ex);
    }
}