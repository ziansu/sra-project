public static org.syncloud.redirect.UserResult error(java.lang.String message, java.lang.Throwable throwable) {
    return new org.syncloud.redirect.UserResult(new org.syncloud.redirect.RedirectError(message, throwable));
}