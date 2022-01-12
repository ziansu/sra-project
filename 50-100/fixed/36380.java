@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    storageController = new com.codecool.android.neightbrotaxi.controller.StorageController(getApplicationContext());
    mMainLayout = ((android.widget.RelativeLayout) (findViewById(R.id.main_layout)));
    mUserName = ((android.widget.TextView) (findViewById(R.id.userName)));
    mUserEmail = ((android.widget.TextView) (findViewById(R.id.userEmail)));
    android.util.Log.i(com.codecool.android.neightbrotaxi.view.MainActivity.TAG, "ACTIVITY CREATED!");
}