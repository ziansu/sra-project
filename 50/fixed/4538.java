private boolean validateEmailFormat(final java.lang.String string) {
    java.lang.String emailCharSequence = string;
    if (Patterns.EMAIL_ADDRESS.matcher(emailCharSequence).matches()) {
        return true;
    }else {
        return false;
    }
}