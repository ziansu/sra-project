@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.util.Log.d("DEBUG", "onCreate EvacuationActivity");
    setContentView(R.layout.evacuation_activity);
    initViews();
    initComponents(savedInstanceState);
}