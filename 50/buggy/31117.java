@java.lang.Override
protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
    return new javax.mail.PasswordAuthentication(gpJavaMailProperties.getProperty(JavaMailProp.MAIL_USER.getValue()), gpJavaMailProperties.getProperty(JavaMailProp.MAIL_PASSWORD.getValue()));
}