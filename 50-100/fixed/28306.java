public org.springframework.mail.SimpleMailMessage constructResetTokenEmail(java.lang.String contextPath, java.util.Locale locale, java.lang.String token, com.bookstore.domain.User user, java.lang.String password) {
    java.lang.String url = (contextPath + "/newUser?token=") + token;
    java.lang.String message = "\nPlease click on this link to verify your email and edit your personal information. Your password is: \n" + password;
    org.springframework.mail.SimpleMailMessage email = new org.springframework.mail.SimpleMailMessage();
    email.setTo(user.getEmail());
    email.setSubject("Le's Bookstore - New User");
    email.setText((url + message));
    email.setFrom(env.getProperty("support.email"));
    return email;
}