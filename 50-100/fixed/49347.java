@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_tuxedo);
    setMMedia();
    setAdSpace();
    fm = getFragmentManager();
    android.app.Fragment fragment = fm.findFragmentById(R.id.fragment_container);
    if (fragment == null) {
        fragment = new com.tk_squared.tuxedo3.SplashFragment();
        fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
    }
    tuxData = tkkDataMod.getInstance(this);
}