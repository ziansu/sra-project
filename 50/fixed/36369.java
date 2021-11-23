@java.lang.Override
public com.dumbster.smtp.MailMessage[] getMessages() {
    checkInitialized();
    synchronized(this) {
        return messages.toArray(new com.dumbster.smtp.MailMessage[messages.size()]);
    }
}