@java.lang.Override
protected void onDestroy() {
    setLastUsedDateInFirebaseDate();
    unregisterAllReceivers();
    removeAllViews();
    com.bry.adcafe.Variables.clearAdTotal();
    super.onDestroy();
}