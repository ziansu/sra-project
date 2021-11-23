@java.lang.Override
public void onNext(java.util.List<com.hulkdx.moneymanager.data.model.Transaction> transactions) {
    if (transactions.isEmpty()) {
        getMvpView().showEmptyTransactions();
    }else {
        getMvpView().showTransactions(transactions);
    }
}