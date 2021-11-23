private boolean isEmailAccountConfigured(android.content.Context ctx) {
    android.accounts.AccountManager am = android.accounts.AccountManager.get(ctx);
    boolean result = false;
    try {
        result = (am.getAccounts().length) > 0;
    } catch (java.lang.Exception e) {
        android.util.Log.e(de.appplant.cordova.emailcomposer.EmailComposer.LOG_TAG, "Missing GET_ACCOUNTS permission.");
        result = true;
    }
    return result;
}