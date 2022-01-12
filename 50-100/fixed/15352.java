public void send(java.util.List<java.lang.String> recipients, java.lang.String subject, java.util.Map<java.lang.Integer, org.safs.tools.mail.Mailer.MimeContent> contents, java.util.Map<java.lang.String, java.lang.String> attchments_alias) throws org.safs.SAFSException {
    java.util.Map<javax.mail.Message.RecipientType, java.util.List<java.lang.String>> type_recipients = new java.util.HashMap<javax.mail.Message.RecipientType, java.util.List<java.lang.String>>();
    type_recipients.put(Message.RecipientType.TO, recipients);
    send(type_recipients, subject, contents, attchments_alias);
}