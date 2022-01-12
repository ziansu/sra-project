@java.lang.Override
public void transactionsLoadFailure(java.lang.String reason) {
    sentCallForTransactions = false;
    loadTransactions(getContext(), accountId, this, wifkey, number_of_transactions_loaded, number_of_transactions_to_load, myTransactions);
}