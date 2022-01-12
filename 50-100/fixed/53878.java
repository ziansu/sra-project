public synchronized void buildEmailAndSend(java.lang.String toAddress, java.lang.String fromAddress, java.lang.String subject, java.lang.String msgBody) {
    org.springframework.mail.SimpleMailMessage message = new org.springframework.mail.SimpleMailMessage();
    message.setFrom(fromAddress);
    message.setTo(toAddress);
    message.setSubject(subject);
    message.setText(msgBody);
    mail.send(message);
}