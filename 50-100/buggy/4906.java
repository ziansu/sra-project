public static void addMessag(java.lang.String message, org.safs.tools.mail.Mailer.MimeType msg_type, java.util.HashMap<java.lang.Integer, org.safs.tools.mail.Mailer.MimeContent> contents) {
    try {
        if (message == null) {
            org.safs.IndependantLog.debug("The message is null, cannot send it.");
            return ;
        }
        org.safs.tools.mail.Mailer.MimeContent content = new org.safs.tools.mail.Mailer.MimeContent(message, msg_type);
        java.lang.Integer order = new java.lang.Integer(contents.size());
        contents.put(order, content);
    } catch (java.lang.Exception e) {
        org.safs.IndependantLog.error("Fail to handle message.", e);
    }
}