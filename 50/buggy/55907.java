@java.lang.Override
public void onPause() {
    super.onPause();
    if (!(_disposable.isDisposed())) {
        _disposable.dispose();
    }
}