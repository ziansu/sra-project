public boolean onActivityResultImpl(@android.support.annotation.NonNull
V v, int requestCode, int resultCode, android.content.Intent data) {
    VP presenter = getPresenter(v, false);
    return (presenter != null) && (presenter.onActivityResult(v, requestCode, resultCode, data));
}