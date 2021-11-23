public int doOperation(final com.android.exchange.eas.EasOperation operation, final java.lang.String loggingName) {
    com.android.mail.utils.LogUtils.d(com.android.exchange.service.EasService.TAG, "%s: %d", loggingName, operation.getAccountId());
    mSynchronizer.syncStart(operation.getAccountId());
    int result = com.android.exchange.eas.EasOperation.RESULT_MIN_OK_RESULT;
    try {
        result = operation.performOperation();
        com.android.mail.utils.LogUtils.d(com.android.exchange.service.EasService.TAG, "Operation result %d", result);
        return result;
    } finally {
        mSynchronizer.syncEnd((result >= (com.android.exchange.eas.EasOperation.RESULT_MIN_OK_RESULT)), operation.getAccount());
    }
}