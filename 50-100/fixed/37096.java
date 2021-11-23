protected void onVisibilityChangedImpl(@android.support.annotation.NonNull
V v, @android.support.annotation.NonNull
android.view.View changedView, int visibility) {
    VP presenter = getPresenter(v, false);
    allowScreenViewCalls = true;
    v.onVisChange(changedView, visibility);
    allowScreenViewCalls = false;
    if (presenter != null)
        presenter.onVisibilityChanged(v, changedView, visibility);
    
}