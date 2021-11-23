@java.lang.Override
public void transactionsLoadFailure(java.lang.String reason) {
    sentCallForTransactions = false;
    if (reason.equals(getContext().getString(R.string.account_names_not_found))) {
    }
    loadTransactions(getContext(), accountId, this, wifkey, number_of_transactions_loaded, number_of_transactions_to_load, myTransactions);
}