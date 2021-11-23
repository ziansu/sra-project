private java.lang.String getTextFromMessage(javax.mail.Message message) throws java.io.IOException, javax.mail.MessagingException {
    java.lang.String result = "";
    if (message.isMimeType("text/plain")) {
        result = message.getContent().toString();
    }else
        if (message.isMimeType("multipart/*")) {
            saveAttachments(message);
            javax.mail.internet.MimeMultipart mimeMultipart = ((javax.mail.internet.MimeMultipart) (message.getContent()));
            result = getTextFromMimeMultipart(mimeMultipart);
        }
    
    return result;
}