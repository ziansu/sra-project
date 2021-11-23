public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
    switch (keyCode) {
        case android.view.KeyEvent.KEYCODE_BACK :
            finish();
            return false;
        default :
            return false;
    }
}