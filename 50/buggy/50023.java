public static <T> void runAuthTask(org.chromium.sync.signin.AccountManagerHelper.AuthTask<T> authTask) {
    new org.chromium.sync.signin.AccountManagerHelper.ConnectionRetry<T>(authTask).attempt();
}