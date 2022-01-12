public boolean doKey(android.view.View v, int keyCode, android.view.KeyEvent event) {
    if ((event.getAction()) == (android.view.KeyEvent.ACTION_UP)) {
        return KeyUp(keyCode, event);
    }else
        if ((event.getAction()) == (android.view.KeyEvent.ACTION_DOWN)) {
            return KeyDown(keyCode, event);
        }
    
    return false;
}