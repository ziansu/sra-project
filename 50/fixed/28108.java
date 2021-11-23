@java.lang.Override
public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
    if (keyCode == (android.view.KeyEvent.KEYCODE_BACK)) {
        if (doneMenuItem.isVisible()) {
            showNotSaveNoteDialog();
            return true;
        }
    }
    return super.onKeyDown(keyCode, event);
}