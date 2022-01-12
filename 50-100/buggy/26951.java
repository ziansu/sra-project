public void onMessage(byte[] message) throws java.io.IOException, javax.mail.MessagingException {
    try (java.io.ByteArrayInputStream bais = new java.io.ByteArrayInputStream(message)) {
        javax.mail.internet.MimeMessage mm = new javax.mail.internet.MimeMessage(null, bais);
        log.debug("send mail: {} ", mm.getMessageID());
        sender.get().send(mm);
    }
}