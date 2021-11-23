@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(getLayoutResourceID());
    initializeUI();
    initializeData();
    android.os.Bundle extras = getIntent().getExtras();
    if (extras != null) {
        initializeDataFromIntentBundle(extras);
    }
    icepick.Icepick.restoreInstanceState(this, savedInstanceState);
    showData();
}