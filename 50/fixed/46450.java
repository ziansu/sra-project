@java.lang.Override
protected void onResume() {
    super.onResume();
    dispatchKeyEvent(new android.view.KeyEvent(android.view.KeyEvent.ACTION_DOWN, android.view.KeyEvent.KEYCODE_DPAD_CENTER));
    dispatchKeyEvent(new android.view.KeyEvent(android.view.KeyEvent.ACTION_UP, android.view.KeyEvent.KEYCODE_DPAD_CENTER));
    mVoiceDetection.changePhrases(Constants.VOICE_MENU_MODE.KEYWORD);
}