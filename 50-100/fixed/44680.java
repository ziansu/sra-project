public void addAttachment(java.lang.String filename) throws java.lang.Exception {
    java.io.File file = new java.io.File(filename);
    javax.mail.BodyPart messageBodyPart = new javax.mail.internet.MimeBodyPart();
    javax.activation.DataSource source = new javax.activation.FileDataSource(file);
    messageBodyPart.setDataHandler(new javax.activation.DataHandler(source));
    messageBodyPart.setFileName(file.getName());
    _multipart.addBodyPart(messageBodyPart);
}