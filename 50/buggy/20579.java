@java.lang.Override
protected void onStart() {
    super.onStart();
    updateSpinnerData();
    dataManager = com.lunokhod.java.android.cashflowapp.DataManager.getInstance(getApplicationContext());
    selectedDate = java.util.Calendar.getInstance();
    setInitialDate(selectedDate);
}