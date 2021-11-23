public boolean isAccountNumberValid(java.lang.String accountNumber) {
    de.fhdw.wipbank.android.rest.AccountAsyncTask accountAsyncTask = new de.fhdw.wipbank.android.rest.AccountAsyncTask(this, getContext());
    accountAsyncTask.setAccountNumber(accountNumber);
    try {
        android.util.Pair<java.lang.String, java.lang.String> responsePair = accountAsyncTask.execute().get();
        if (responsePair == null)
            return false;
        else
            return (responsePair.first) != null;
        
    } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
        e.printStackTrace();
        return false;
    }
}