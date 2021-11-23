@java.lang.Override
protected void onStop() {
    super.onStop();
    com.breadwallet.tools.manager.CurrencyManager.getInstance(this).stopTimerTask();
}