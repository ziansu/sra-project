private static com.google.api.services.gmail.model.Message createMessageWithEmail(javax.mail.internet.MimeMessage email) throws java.io.IOException, javax.mail.MessagingException {
    final java.io.ByteArrayOutputStream bytes = new java.io.ByteArrayOutputStream();
    email.writeTo(bytes);
    java.lang.String encodedEmail = com.google.api.client.repackaged.org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(bytes.toByteArray());
    com.google.api.services.gmail.model.Message message = new com.google.api.services.gmail.model.Message();
    message.setRaw(encodedEmail);
    message.setId("this is fake id");
    return message;
}