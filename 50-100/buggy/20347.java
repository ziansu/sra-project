public void sendMessage(java.lang.String subject, java.lang.String body, java.lang.String from, java.lang.String to) throws com.teamd.taxi.service.email.MessagingException, javax.mail.internet.AddressException {
    javax.mail.internet.MimeMessage msg = new javax.mail.internet.MimeMessage(session);
    msg.setSubject(subject);
    msg.setContent(body, "text/html");
    msg.setFrom(new javax.mail.internet.InternetAddress(from));
    msg.addRecipients(Message.RecipientType.TO, javax.mail.internet.InternetAddress.parse(to));
    com.teamd.taxi.service.email.Transport.send(msg);
}