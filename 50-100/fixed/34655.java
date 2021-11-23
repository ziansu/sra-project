public boolean onKey(android.view.View v, int keyCode, android.view.KeyEvent event) {
    if ((keyCode == (android.view.KeyEvent.KEYCODE_ENTER)) && ((event.getAction()) == (android.view.KeyEvent.ACTION_UP))) {
        answerTheQuestion();
        return true;
    }
    return false;
}