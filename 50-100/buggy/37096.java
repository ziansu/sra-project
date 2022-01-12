protected void onVisibilityChangedImpl(@android.support.annotation.NonNull
V v, @android.support.annotation.NonNull
android.view.View changedView, int visibility) {
    allowScreenViewCalls = true;
    v.onVisChange(changedView, visibility);
    allowScreenViewCalls = false;
    VP presenter = getPresenter(v);
    if (presenter != null)
        presenter.onVisibilityChanged(v, changedView, visibility);
    
}