void calcTransactionTimes() {
    long tt = java.lang.System.currentTimeMillis();
    msSinceLastTransaction = tt - (lastTransactionTime);
    lastTransactionTime = tt;
    if ((msAverageTransactionDeltaTime) == 0) {
        msAverageTransactionDeltaTime = msSinceLastTransaction;
    }else {
        msAverageTransactionDeltaTime = (((msAverageTransactionDeltaTime) * ((numberOfAllTransactions) - 1)) + (msSinceLastTransaction)) / (numberOfAllTransactions);
    }
}