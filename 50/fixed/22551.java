private void afterSetContentView(android.view.View view) {
    mView = view;
    init(view);
    if ((mLoadingView) != null) {
        mLoadingView.register(this);
    }
}