private java.lang.String getTextFromMessage(javax.mail.Message message) throws java.io.IOException, javax.mail.MessagingException {
    saveAttachments(message);
    java.lang.String result = "";
    if (message.isMimeType("text/plain")) {
        result = message.getContent().toString();
    }else
        if (message.isMimeType("multipart/*")) {
            javax.mail.internet.MimeMultipart mimeMultipart = ((javax.mail.internet.MimeMultipart) (message.getContent()));
            result = getTextFromMimeMultipart(mimeMultipart);
        }
    
    return result;
}