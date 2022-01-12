public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
    if ((event.getAction()) == (android.view.KeyEvent.ACTION_UP)) {
        switch (keyCode) {
            case android.view.KeyEvent.KEYCODE_MENU :
                android.util.Log.i(com.arefly.wordcounter.MainActivity.TAG, "Menu Button Clicked");
                topToolbar.showOverflowMenu();
                return true;
        }
    }
    return super.onKeyUp(keyCode, event);
}