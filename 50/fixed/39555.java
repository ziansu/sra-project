public void onPause(@android.support.annotation.NonNull
V v) {
    VP presenter = getPresenter(v, false);
    if (presenter != null)
        presenter.onPause(v);
    
}