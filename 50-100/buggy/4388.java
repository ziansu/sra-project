@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    ((com.v2tech.view.MainApplication) (this.getApplication())).onMainCreate();
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main_activity);
    mMainLayout = ((android.widget.FrameLayout) (findViewById(R.id.main)));
    initMapviewLayout();
    initBottomButtonLayout();
    initTitleBarButtonLayout();
    initResetOrder();
    findViewById(R.id.title_bar_center_tv).setVisibility(View.GONE);
    findViewById(R.id.title_bar_logo).setVisibility(View.VISIBLE);
}