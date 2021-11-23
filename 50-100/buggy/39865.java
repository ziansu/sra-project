@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.update_steps_in_application_process_activity);
    com.example.christinaaiello.applicationprocess.UpdateStepsInApplicationProcessActivity.requestCode = 4;
    TAG = "UpdateStepsInApplicationProcessActivity";
    com.example.christinaaiello.general.DatabaseContract.DatabaseHelper databaseHelper = new com.example.christinaaiello.general.DatabaseContract.DatabaseHelper(getApplicationContext());
    db = databaseHelper.getReadableDatabase();
    updateStepsBundle = getIntent().getExtras();
    ID = updateStepsBundle.getString("ID");
    android.util.Log.e(TAG, ("Company ID inside update is: " + (ID)));
    com.example.christinaaiello.applicationprocess.UpdateStepsInApplicationProcessActivity.interviewNumber = 0;
    getLayoutItemsOnScreen();
    seeIfDataExists(ID);
    initializeClicking();
}