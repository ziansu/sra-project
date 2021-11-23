@java.lang.Override
protected void onHandleIntent(android.content.Intent intent) {
    setStarted(true);
    createTimerTask();
    setUpTimer(updateTimerTask);
}