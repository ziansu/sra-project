@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);
    com.bloodshare.bloodshareandroid.ui.login.MobileInputFragment mobileInputFragment = com.bloodshare.bloodshareandroid.ui.login.MobileInputFragment.newInstance();
    addFragment(mobileInputFragment, MobileInputFragment.TAG);
}