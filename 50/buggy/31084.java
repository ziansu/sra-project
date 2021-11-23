@java.lang.Override
protected void onDestroy() {
    setLastUsedDateInFirebaseDate();
    unregisterAllReceivers();
    removeAllViews();
    addToSharedPreferences();
    com.bry.adcafe.Variables.clearAdTotal();
    super.onDestroy();
}