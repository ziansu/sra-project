public static <T> void runAuthTask(android.content.Context context, org.chromium.sync.signin.AccountManagerHelper.AuthTask<T> authTask) {
    new org.chromium.sync.signin.AccountManagerHelper.ConnectionRetry<T>(context, authTask).attempt();
}