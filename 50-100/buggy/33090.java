public void sendEmail(java.lang.String toAddress, java.lang.String fromAddress, java.lang.String subject, java.lang.String msgBody) throws javax.mail.MessagingException {
    javax.mail.internet.MimeMessage mimeMessage = mailSender.createMimeMessage();
    org.springframework.mail.javamail.MimeMessageHelper helper = new org.springframework.mail.javamail.MimeMessageHelper(mimeMessage, false);
    mimeMessage.setContent(msgBody, "text/html; charset=UTF-8");
    helper.setTo(toAddress);
    helper.setSubject(subject);
    helper.setFrom(fromAddress);
    mailSender.send(mimeMessage);
}