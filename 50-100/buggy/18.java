@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_fragment_container);
    doExtra();
    android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
    android.support.v4.app.Fragment fragment = fm.findFragmentById(R.id.container_fragment_activity);
    if (fragment == null) {
        fragment = createFragment();
    }
    fm.beginTransaction().add(R.id.container_fragment_activity, fragment).commit();
}