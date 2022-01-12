@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_error);
    try {
        setUpActionBar();
    } catch (java.lang.Exception e) {
        android.util.Log.e(org.schabi.newpipe.report.ErrorActivity.TAG, "Error setting up ErrorActivity", e);
    }
    android.content.Intent intent;
    if ((intent = getIntent()) != null) {
        onNewIntent(intent);
    }
}