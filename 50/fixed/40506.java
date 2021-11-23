@java.lang.Override
public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
    android.util.Log.d("xxxdebug", "in onKeyDown");
    if (keyCode == (android.view.KeyEvent.KEYCODE_BACK)) {
        local.isi.wheelofluck.view.Arrow.removeRunnables = true;
    }
    return super.onKeyDown(keyCode, event);
}