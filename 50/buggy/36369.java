@java.lang.Override
public com.dumbster.smtp.MailMessage[] getMessages() {
    checkInitialized();
    return messages.toArray(new com.dumbster.smtp.MailMessage[0]);
}