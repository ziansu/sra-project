@org.jetbrains.annotations.NotNull
private javax.mail.internet.MimeMessage buildMessage(tcpassresetplugin.SUser user, tcpassresetplugin.SmtpConfig config, org.springframework.mail.javamail.JavaMailSenderImpl sender) throws javax.mail.MessagingException {
    javax.mail.internet.MimeMessage message = sender.createMimeMessage();
    message.setFrom(new javax.mail.internet.InternetAddress(config.getFromAddress()));
    message.addRecipient(Message.RecipientType.TO, new javax.mail.internet.InternetAddress(user.getEmail()));
    message.setSubject("TeamCity password reset");
    message.setText(getMessageBody(user));
    return message;
}