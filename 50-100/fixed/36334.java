public java.lang.String sendEmail(java.lang.String to, java.lang.String from, java.lang.String senderAddress, java.lang.String subject, java.lang.String bodyText) throws java.io.IOException, javax.mail.MessagingException {
    com.google.api.services.gmail.Gmail service = ro.tamadawines.core.service.EmailService.getGmailService();
    java.lang.String user = "me";
    javax.mail.internet.MimeMessage mail = ro.tamadawines.core.service.EmailService.createEmail(to, from, senderAddress, subject, bodyText);
    return sendMessage(service, user, mail);
}