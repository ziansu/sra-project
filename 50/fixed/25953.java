public boolean CheckEmailFormat(java.lang.String emailAddress) {
    emailAddress.trim();
    if (emailAddress == null) {
        return false;
    }else {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(emailAddress).matches();
    }
}