public java.lang.String processEmail(java.lang.String email) {
    java.lang.String emailStatus = "Controller";
    emailStatus = regex.emailChecker(email);
    return emailStatus;
}