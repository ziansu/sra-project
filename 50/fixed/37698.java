@java.lang.Override
public void send(java.util.Collection<java.lang.String> to, java.util.Collection<java.lang.String> ccs, java.util.Collection<java.lang.String> bccs, java.lang.String subject, java.lang.String body) throws com.premiumminds.webapp.utils.mailer.MailerException {
    this.send(to, ccs, bccs, null, subject, body);
}