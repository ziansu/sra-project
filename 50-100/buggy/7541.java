@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_plan_journey);
    java.util.Calendar calendar = java.util.Calendar.getInstance();
    datePickerDialog = new android.app.DatePickerDialog(this, this, calendar.get(java.util.Calendar.YEAR), calendar.get(java.util.Calendar.MONTH), calendar.get(java.util.Calendar.DAY_OF_MONTH));
    initDrawer();
    initSubmitButton();
    initSearchBar();
    initAddressFields();
    initRemoveButtons();
    initViewJourney();
    initFirebase();
    clearUI();
}