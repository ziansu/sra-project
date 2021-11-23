@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.test_layout);
    initView();
    initListener();
    for (int i = 0; i < 1; i++) {
        testPaoMaDeng();
    }
}