private boolean isEmailAccountConfigured(android.content.Context ctx) {
    android.accounts.AccountManager am = android.accounts.AccountManager.get(ctx);
    try {
        return (am.getAccounts().length) > 0;
    } catch (java.lang.Exception e) {
        android.util.Log.e(de.appplant.cordova.emailcomposer.EmailComposer.LOG_TAG, "Missing GET_ACCOUNTS permission.");
        return true;
    }
}