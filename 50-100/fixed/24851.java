protected static javax.mail.internet.MimeMessage prepareMimeMessage(javax.mail.Session session, java.util.List<java.lang.String> recipients, java.lang.String from, java.lang.String subject) throws java.lang.Exception {
    java.util.Map<javax.mail.Message.RecipientType, java.util.List<java.lang.String>> type_recipients = new java.util.HashMap<javax.mail.Message.RecipientType, java.util.List<java.lang.String>>();
    type_recipients.put(Message.RecipientType.TO, recipients);
    return org.safs.tools.mail.Mailer.prepareMimeMessage(session, type_recipients, from, subject);
}