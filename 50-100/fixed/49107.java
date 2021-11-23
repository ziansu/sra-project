@java.lang.Override
public void prepare(final javax.mail.internet.MimeMessage mimeMessage) {
    org.springframework.mail.javamail.MimeMessageHelper message = new org.springframework.mail.javamail.MimeMessageHelper(mimeMessage);
    try {
        message.setTo(toEmail);
        message.setSubject(strSubjectEmail);
        java.lang.String text = org.springframework.ui.velocity.VelocityEngineUtils.mergeTemplateIntoString(velocityEngine, templateFile, model);
        message.setText(text, true);
    } catch (javax.mail.MessagingException e) {
        e.printStackTrace();
    }
}