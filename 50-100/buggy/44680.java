public void addAttachment(java.lang.String filename) throws java.lang.Exception {
    javax.mail.BodyPart messageBodyPart = new javax.mail.internet.MimeBodyPart();
    javax.activation.DataSource source = new javax.activation.FileDataSource(filename);
    messageBodyPart.setDataHandler(new javax.activation.DataHandler(source));
    messageBodyPart.setFileName(filename);
    _multipart.addBodyPart(messageBodyPart);
}