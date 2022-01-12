public void onFinishInflateImpl(@android.support.annotation.NonNull
V v) {
    VP presenter = getPresenter(v, true);
    if (v.isButtery())
        butterknife.ButterKnife.bind(v);
    
    allowScreenViewCalls = true;
    v.onInflate();
    allowScreenViewCalls = false;
    if (presenter != null)
        presenter.onFinishInflate(v);
    
}