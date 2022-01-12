@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_export);
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    setSupportActionBar(toolbar);
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    android.util.Log.d(TAG, ("savedInstance " + savedInstanceState));
    if (savedInstanceState == null) {
        showFragment(com.rorlig.babylog.ui.fragment.export.ExportFragment.class, "export_fragment", false);
    }
}