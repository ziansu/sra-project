public boolean isErrorFatal() {
    com.box.androidsdk.content.BoxException.ErrorType type = getErrorType();
    com.box.androidsdk.content.BoxException.ErrorType[] fatalTypes = new com.box.androidsdk.content.BoxException.ErrorType[]{ com.box.androidsdk.content.BoxException.ErrorType.INVALID_GRANT_INVALID_TOKEN , com.box.androidsdk.content.BoxException.ErrorType.INVALID_GRANT_TOKEN_EXPIRED , com.box.androidsdk.content.BoxException.ErrorType.ACCESS_DENIED , com.box.androidsdk.content.BoxException.ErrorType.NO_CREDIT_CARD_TRIAL_ENDED , com.box.androidsdk.content.BoxException.ErrorType.SERVICE_BLOCKED , com.box.androidsdk.content.BoxException.ErrorType.INVALID_CLIENT , com.box.androidsdk.content.BoxException.ErrorType.UNAUTHORIZED_DEVICE , com.box.androidsdk.content.BoxException.ErrorType.GRACE_PERIOD_EXPIRED , com.box.androidsdk.content.BoxException.ErrorType.UNAUTHORIZED , com.box.androidsdk.content.BoxException.ErrorType.OTHER };
    for (com.box.androidsdk.content.BoxException.ErrorType fatalType : fatalTypes) {
        if (type == fatalType) {
            return true;
        }
    }
    return false;
}