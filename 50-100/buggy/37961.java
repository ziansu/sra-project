public void send(java.util.List<java.lang.String> recipients, java.lang.String subject, java.lang.Object body, org.safs.tools.mail.Mailer.MimeType type, java.util.HashMap<java.lang.String, java.lang.String> attchments_alias) throws org.safs.SAFSException {
    java.util.HashMap<java.lang.Integer, org.safs.tools.mail.Mailer.MimeContent> contents = new java.util.HashMap<java.lang.Integer, org.safs.tools.mail.Mailer.MimeContent>();
    contents.put(new java.lang.Integer(0), new org.safs.tools.mail.Mailer.MimeContent(body, type));
    send(recipients, subject, contents, attchments_alias);
}