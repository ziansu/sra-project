private void afterSetContentView() {
    init(mView);
    if ((mLoadingView) != null) {
        mLoadingView.register(this);
    }
}