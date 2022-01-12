@java.lang.Override
public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
    if ((keyCode == (android.view.KeyEvent.KEYCODE_BACK)) && (progressParam.cancelable)) {
        if (contentView.isEnabled()) {
            contentView.setEnabled(false);
        }
        onFinish();
    }
    return true;
}