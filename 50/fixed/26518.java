@android.annotation.SuppressLint(value = "NewApi")
public void run() {
    if (_targetView != null) {
        _targetView.loadUrl(("javascript:" + _jsString));
    }
}