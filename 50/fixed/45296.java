@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mPresenter = new ru.android.vkapp.presenter.MainPresenter(this, getLoaderManager(), this);
    mPresenter.initVKSdk(this);
    init();
}