private void afterSetContentView(android.view.View v) {
    mView = v;
    init(v);
    if ((mLoadingView) != null) {
        mLoadingView.register(this);
    }
}