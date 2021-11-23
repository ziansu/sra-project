public void run(android.accounts.AccountManagerFuture<android.accounts.Account[]> future) {
    try {
        _googleAccounts = future.getResult();
        this.setListAdapter(new com.axelby.podax.ImportSubscriptionActivity.ImportSubscriptionAdapter());
    } catch (android.accounts.OperationCanceledException e) {
        android.util.Log.e("Podax", "Operation Canceled", e);
    } catch (java.io.IOException e) {
        android.util.Log.e("Podax", "IOException", e);
    } catch (android.accounts.AuthenticatorException e) {
        android.util.Log.e("Podax", "Authentication Failed", e);
    }
}