void calcTransactionTimes() {
    long tt = java.lang.System.currentTimeMillis();
    msSinceLastTransaction = tt - (lastTransactionTime);
    lastTransactionTime = tt;
    msAverageTransactionDeltaTime = (((msAverageTransactionDeltaTime) * ((numberOfAllTransactions) - 1)) + (msSinceLastTransaction)) / (numberOfAllTransactions);
}