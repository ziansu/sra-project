@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(getLayoutResourceID());
    icepick.Icepick.restoreInstanceState(this, savedInstanceState);
    initializeUI();
    initializeData();
    android.os.Bundle extras = getIntent().getExtras();
    if (extras != null) {
        initializeDataFromIntentBundle(extras);
    }
    showData();
}