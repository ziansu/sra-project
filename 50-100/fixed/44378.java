@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    activityMainBinding = android.databinding.DataBindingUtil.setContentView(this, R.layout.activity_main);
    configureToolbar();
    setTriggers();
    if ((com.parse.ParseUser.getCurrentUser()) == null) {
        android.content.Intent intent = com.org.saolonguinho.login.LoginActivity.createIntent(getApplicationContext());
        intent.setFlags(((android.content.Intent.FLAG_ACTIVITY_NEW_TASK) | (android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK)));
        startActivity(intent);
    }else {
        configureNavigation();
        setFragment();
        startSimpleAds();
    }
}