public void onFinishInflateImpl(@android.support.annotation.NonNull
V v) {
    if (v.isButtery())
        butterknife.ButterKnife.bind(v);
    
    allowScreenViewCalls = true;
    v.onInflate();
    allowScreenViewCalls = false;
    VP presenter = getPresenter(v);
    if (presenter != null)
        presenter.onFinishInflate(v);
    
}