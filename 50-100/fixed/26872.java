@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    com.pfc.android.archcomponent.ui.ListFragment fragment = new com.pfc.android.archcomponent.ui.ListFragment();
    fragmentContainer = findViewById(R.id.fragment_container);
    permissionsRequester = com.pfc.android.archcomponent.util.PermissionsRequester.newInstance(this);
    if (savedInstanceState == null) {
        getSupportFragmentManager().beginTransaction().replace(R.id.content_fragment, fragment).commit();
    }
}