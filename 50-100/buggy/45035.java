public void sendMenuStatusUpdateEmail(com.vs.model.menu.Menu menu) {
    java.lang.String to = userRepository.findOne(menu.getUserName()).getEmail();
    com.vs.model.email.Email email = getEmail(EmailConstants.EMAIL_CONTACT, to, "Application Restarted", VMConstants.VM_SEND_EMAIL_NOTIFICATION, null);
    try {
        sendEmail.sendEmail(email);
    } catch (javax.mail.MessagingException me) {
        log.error(" Error Sending email {}", me);
    }
}