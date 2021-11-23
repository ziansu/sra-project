@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    overridePendingTransition(0, 0);
    com.ftinc.scoop.Scoop.getInstance().apply(this);
    setContentView(R.layout.activity_main);
    butterknife.ButterKnife.bind(this);
    com.ftinc.scoop.Scoop.getInstance().bind(this);
    setSupportActionBar(mAppBar);
}