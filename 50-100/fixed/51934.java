private javax.mail.Session getSession() {
    final java.util.Properties props = new java.util.Properties();
    props.put(bioLockJ.module.postProcessor.EmailReportModule.EMAIL_SMTP_AUTH, emailSmtpAuth);
    props.put(bioLockJ.module.postProcessor.EmailReportModule.EMAIL_START_TLS_ENABLE, emailTls);
    props.put(bioLockJ.module.postProcessor.EmailReportModule.EMAIL_HOST, emailHost);
    props.put(bioLockJ.module.postProcessor.EmailReportModule.EMAIL_PORT, emailPort);
    final javax.mail.Session session = javax.mail.Session.getInstance(props, new javax.mail.Authenticator() {
        @java.lang.Override
        protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
            return new javax.mail.PasswordAuthentication(emailFrom, decrypt(emailEncryptedPassword));
        }
    });
    return session;
}