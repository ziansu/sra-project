@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mPresenter.checkAutoUpdateByUmeng();
    initRecycleView();
    setTitle(getString(R.string.app_name), false);
    mPresenter.checkVersionInfo();
    java.lang.String ste = "^*";
}