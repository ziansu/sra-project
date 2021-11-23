public boolean CheckEmailFormat(java.lang.String emailAddress) {
    if (emailAddress == null) {
        return false;
    }else {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(emailAddress).matches();
    }
}