@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_inside_library);
    butterknife.ButterKnife.bind(this);
    intentFlag = getIntent().getExtras();
    if ((intentFlag) != null) {
        inLibrary = intentFlag.getBoolean("IN_LIBRARY");
    }
    initView();
    startScan();
}