@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    com.facebook.FacebookSdk.sdkInitialize(getApplicationContext());
    track_screenView();
}