public void resetPassword() throws javax.mail.MessagingException, javax.naming.NamingException {
    com.hkstlr.reeler.weblogger.users.entities.User userToGet;
    try {
        userToGet = userManager.getUserByUserName(username);
        java.util.logging.Logger.getLogger(com.hkstlr.reeler.weblogger.users.boundary.auth.ResetPasswordBean.class.getName()).log(java.util.logging.Level.INFO, "user:{0}", userToGet.toJsonString());
        java.lang.String subject = "Reset Password request ";
        java.lang.String body = "reset password link here";
        sendMessage(userToGet.getEmailAddress());
    } catch (javax.persistence.NoResultException | java.lang.NullPointerException ex) {
        java.util.logging.Logger.getLogger(com.hkstlr.reeler.weblogger.users.boundary.auth.ResetPasswordBean.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
}