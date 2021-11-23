@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_home);
    runtimePermission();
    butterknife.ButterKnife.bind(this);
    com.olegsagenadatrytwo.partyapp.inject.view.home_activity.DaggerHomeActivityComponent.create().inject(this);
    presenter.attachView(this);
    presenter.setContext(this);
    presenter.rxJavaEventbrite();
    if ((Build.VERSION.SDK_INT) >= 21) {
        updateStatusBar();
    }else {
    }
    updateMapSnapshot();
}