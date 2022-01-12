private static boolean dummyAccountAlreadyAdded(android.accounts.Account[] accountsByType) {
    for (int i = 0; i < (accountsByType.length); i++) {
        if (accountsByType[i].name.equals(com.philosophicalhacker.philhackernews.PhilHackerNewsApplication.ACCOUNT_NAME)) {
            return true;
        }
    }
    return false;
}