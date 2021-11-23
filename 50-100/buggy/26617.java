public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
    try {
        if ((keyCode == (android.view.KeyEvent.KEYCODE_BACK)) && (webview.canGoBack())) {
            android.util.Log.v(org.radare2.installer.WebActivity.TAG, "onKeyDown() called");
            mUtils.killradare();
            finish();
            return true;
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return super.onKeyDown(keyCode, event);
}