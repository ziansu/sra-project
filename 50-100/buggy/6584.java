private boolean isEmailAccountConfigured(android.content.Context ctx) {
    android.accounts.AccountManager am = android.accounts.AccountManager.get(ctx);
    try {
        for (android.accounts.Account account : am.getAccounts()) {
            if (account.type.endsWith("mail")) {
                return true;
            }
        }
    } catch (java.lang.Exception e) {
        android.util.Log.e(de.appplant.cordova.emailcomposer.EmailComposer.LOG_TAG, "Missing GET_ACCOUNTS permission.");
        return true;
    }
    return false;
}