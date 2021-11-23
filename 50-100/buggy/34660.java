private void checkParam(java.lang.String value, boolean required) {
    boolean illegal = false;
    illegal |= required && (com.google.common.base.Strings.isNullOrEmpty(value));
    illegal |= (value != null) && ((value.length()) > (org.activityinfo.server.login.SignUpConfirmationController.MAX_PARAM_LENGTH));
    if (illegal) {
        throw new java.lang.IllegalArgumentException();
    }
}