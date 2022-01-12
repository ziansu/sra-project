private org.springframework.mail.SimpleMailMessage constructResendVerificationTokenEmail(final java.lang.String contextPath, final java.util.Locale locale, final com.thinkcloudgroup.shopapp.model.VerificationToken newToken, final com.thinkcloudgroup.shopapp.objects.User user) {
    final java.lang.String confirmationUrl = (contextPath + "/registrationConfirm.html?token=") + (newToken.getToken());
    final java.lang.String message = messages.getMessage("message.resendToken", null, locale);
    return constructEmail("Resend Registration Token", ((message + " \r\n") + confirmationUrl), user);
}