private java.lang.String getMimeMessageBody(final org.subethamail.wiser.WiserMessage message) throws java.io.IOException, javax.mail.MessagingException {
    java.lang.Object content = getMimeMessage(message).getContent();
    if (content instanceof javax.mail.internet.MimeMessage) {
        return content.toString();
    }
    if (content instanceof javax.mail.internet.MimeMultipart) {
        return getMimeMultipartAsString(((javax.mail.internet.MimeMultipart) (content)));
    }
    throw new java.lang.RuntimeException("Unexpected MimeMessage content");
}