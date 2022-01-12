@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    logger.info(com.jeffcunningham.lv4t_android.MainActivity.TAG, "onCreate: ");
    component().inject(this);
    android.support.v7.app.ActionBar actionBar = getSupportActionBar();
    actionBar.hide();
    setContentView(R.layout.activity_login);
    butterknife.ButterKnife.bind(this);
    org.greenrobot.eventbus.EventBus.getDefault().register(this);
    selectedConfiguration = getString(R.string.selected_configuration);
    if (selectedConfiguration.equalsIgnoreCase(Constants.LAYOUT)) {
        initializeNormalLayout();
    }else {
        initializeLandscapeOrLargeLayout();
    }
}