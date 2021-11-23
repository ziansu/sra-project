@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_stats);
    butterknife.ButterKnife.bind(this);
    if ((getSupportActionBar()) != null) {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    org.a5calls.android.a5calls.model.DatabaseHelper db = org.a5calls.android.a5calls.AppSingleton.getInstance(this).getDatabaseHelper();
    initializeUI(db);
}