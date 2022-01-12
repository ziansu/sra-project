@java.lang.Override
protected void onCreate(final android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.amazonaws.mobile.AWSMobileClient.initializeMobileClientIfNecessary(this);
    final com.amazonaws.mobile.AWSMobileClient awsMobileClient = com.amazonaws.mobile.AWSMobileClient.defaultMobileClient();
    identityManager = awsMobileClient.getIdentityManager();
    setContentView(R.layout.activity_main);
    setupToolbar(savedInstanceState);
    setupNavigationMenu(savedInstanceState);
    runLocationService();
}