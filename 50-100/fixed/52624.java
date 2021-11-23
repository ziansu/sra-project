private void onSavingsUpdated() {
    this.logger().info("Savings loaded.");
    this.allSavings.clear();
    java.util.List<de.fau.amos.virtualledger.android.model.SavingsAccount> savingAccounts = null;
    try {
        savingAccounts = this.savingsAccountsDataManager.getSavingsAccounts();
    } catch (de.fau.amos.virtualledger.android.data.SyncFailedException e) {
        android.util.Log.e("", "Sync failed");
        return ;
    }
    if (savingAccounts != null) {
        this.allSavings.addAll(savingAccounts);
    }
    notifyObservers();
}