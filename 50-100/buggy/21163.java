public boolean onKey(android.view.View v, int keyCode, android.view.KeyEvent event) {
    if (((event.getAction()) == (android.view.KeyEvent.ACTION_DOWN)) && (keyCode == (android.view.KeyEvent.KEYCODE_ENTER))) {
        try {
            mAnswer.clearFocus();
            mAnswer.setSelection(View.FOCUS_FORWARD);
        } catch (java.lang.Exception e) {
            return false;
        }
        return true;
    }
    mAnswer.requestFocus();
    mAnswer.setFocusable(true);
    mAnswer.setFocusableInTouchMode(true);
    return false;
}