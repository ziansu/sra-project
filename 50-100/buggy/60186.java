public void doGetVideoSampleTutorial(android.content.Context mContext, android.support.v4.app.Fragment fragmentContext) {
    try {
        com.simplelecture.main.transactions.DemoTutorialTransaction demoTutorialTransaction = new com.simplelecture.main.transactions.DemoTutorialTransaction(null, mContext);
        com.simplelecture.main.http.TransactionProcessor transactionProcessor = new com.simplelecture.main.http.TransactionProcessor(mContext);
        transactionProcessor.execute(demoTutorialTransaction);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}