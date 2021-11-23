private boolean validateEmailFormat(final java.lang.String string) {
    java.lang.CharSequence emailCharSequence = email;
    if (Patterns.EMAIL_ADDRESS.matcher(emailCharSequence).matches()) {
        return true;
    }else {
        return false;
    }
}