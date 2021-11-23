@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_customed_refresh);
    loadingLayout = ((com.zayn.loadingview.library.NestedLoadingLayout) (findViewById(R.id.loadLayout)));
    com.zayn.loadingview.ui.LoadingSwipeListener loadingSwipeListener = new com.zayn.loadingview.ui.LoadingSwipeListener();
    loadingSwipeListener.bindPullLoadView(loadingLayout, Gravity.START);
}