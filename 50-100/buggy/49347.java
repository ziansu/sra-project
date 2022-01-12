@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_tuxedo);
    setMMedia();
    setAdSpace();
    android.app.FragmentManager fm = getFragmentManager();
    android.app.Fragment fragment = fm.findFragmentById(R.id.splash_fragment);
    if (fragment == null) {
        fragment = new com.tk_squared.tuxedo3.SplashFragment();
        fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
    }
    tuxData = tkkDataMod.getInstance(this);
}