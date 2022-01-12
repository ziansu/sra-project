@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    android.support.v4.app.FragmentManager fM = getSupportFragmentManager();
    android.support.v4.app.FragmentTransaction fT = fM.beginTransaction();
    android.support.v4.app.Fragment fragment = fM.findFragmentById(R.id.fragment_spot);
    if (fragment == null) {
        fragment = new com.citylist.android.wereiwas.SplashFragment();
        fT.add(R.id.fragment_spot, fragment);
        fT.commit();
    }
    android.content.Intent i = new android.content.Intent(this, com.citylist.android.wereiwas.GPSService.class);
    startService(i);
}