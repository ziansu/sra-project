public synchronized void buildEmailAndSend(java.lang.String toAddress, java.lang.String fromAddress, java.lang.String subject, java.lang.String msgBody) {
    org.springframework.mail.SimpleMailMessage Msg = new org.springframework.mail.SimpleMailMessage();
    Msg.setFrom(fromAddress);
    Msg.setTo(toAddress);
    Msg.setSubject(subject);
    Msg.setText(msgBody);
    mail.send();
}