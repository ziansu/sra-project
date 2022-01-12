@java.lang.Override
public boolean onKeyLongPress(int keyCode, android.view.KeyEvent event) {
    if (keyCode == (android.view.KeyEvent.KEYCODE_VOLUME_DOWN)) {
        android.util.Log.d("Test", "Long press!");
        flag = false;
        flag2 = true;
        saveImage();
        return true;
    }
    if (keyCode == (android.view.KeyEvent.KEYCODE_POWER)) {
        finish();
        return true;
    }
    return super.onKeyLongPress(keyCode, event);
}