@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(getLayoutId());
    butterknife.ButterKnife.bind(this);
    setupActivityComponent(com.example.sf.myapplication.MyApplication.getsInstance().getAppComponent());
    init();
}