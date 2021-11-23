@java.lang.Override
public boolean onKey(android.view.View v, int keyCode, amu.areeb.btech.KeyEvent event) {
    if (((event.getAction()) == (KeyEvent.ACTION_DOWN)) && (keyCode == (KeyEvent.KEYCODE_ENTER))) {
        final amu.areeb.btech.InputMethodManager imm = ((amu.areeb.btech.InputMethodManager) (getSystemService(Context.INPUT_METHOD_SERVICE)));
        en.requestFocus();
        en.postDelayed(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                imm.showSoftInput(en, InputMethodManager.SHOW_FORCED);
            }
        }, 1);
        return true;
    }
    return false;
}