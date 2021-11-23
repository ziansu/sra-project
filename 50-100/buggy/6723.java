@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    butterknife.ButterKnife.bind(this);
    setSupportActionBar(toolbar);
    connectionService = com.northghost.caketube.AFConnectionService.newBuilder(this).addConnectionCallbacksListener(this).addVPNConnectionStateListener(this).setName(getString(R.string.app_name)).build();
}