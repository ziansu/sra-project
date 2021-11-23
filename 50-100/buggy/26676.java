public boolean onKey(android.view.View v, int keyCode, android.view.KeyEvent event) {
    if (((event.getAction()) == (android.view.KeyEvent.ACTION_DOWN)) && (keyCode == (android.view.KeyEvent.KEYCODE_ENTER))) {
        savePGN.run();
        dialog.cancel();
        return true;
    }
    return false;
}