@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    if (nl.mprog.glimp.work_out.CheckNetwork.isInternetAvailable(this)) {
        com.google.firebase.auth.FirebaseAuth mAuth = com.google.firebase.auth.FirebaseAuth.getInstance();
        mAuth.signInAnonymously();
        mViewPager = ((android.support.v4.view.ViewPager) (findViewById(R.id.container)));
        setViewPager();
        android.support.design.widget.TabLayout tabLayout = ((android.support.design.widget.TabLayout) (findViewById(R.id.tabs)));
        tabLayout.setupWithViewPager(mViewPager);
    }else {
        nl.mprog.glimp.work_out.CheckNetwork.displayAlertDialog(this);
    }
}