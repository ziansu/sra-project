public void doShowBalance(android.view.View v) {
    if (!(oldTx()))
        act.sayOk("Customer Balance", A.balance, null);
    
}