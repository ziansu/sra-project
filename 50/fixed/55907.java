@java.lang.Override
public void onPause() {
    super.onPause();
    if ((_disposable) != null) {
        _disposable.dispose();
    }
}