@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    android.util.Log.d(TAG, ("savedInstance " + savedInstanceState));
    if (savedInstanceState == null) {
        showFragment(com.rorlig.babylog.ui.fragment.export.ExportFragment.class, "export_fragment", false);
    }
}