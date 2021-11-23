protected boolean specificShowError(int messageId) {
    switch (getErrorType(messageId)) {
        case USERNAME :
        case PASSWORD :
            showPasswordError(messageId);
            showUsernameError(messageId);
            return true;
        default :
            return false;
    }
}