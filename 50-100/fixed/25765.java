@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) throws java.lang.SecurityException {
    super.onCreate(savedInstanceState);
    this.setContentView(R.layout.activity_main);
    butterknife.ButterKnife.bind(this);
    addCamera();
    client = new com.google.android.gms.common.api.GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
}