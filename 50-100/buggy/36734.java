public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
    switch (keyCode) {
        case android.view.KeyEvent.KEYCODE_VOLUME_DOWN :
            zoom(false);
            return true;
        case android.view.KeyEvent.KEYCODE_VOLUME_UP :
            zoom(true);
            return true;
    }
    return super.onKeyUp(keyCode, event);
}