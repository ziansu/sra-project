public boolean onKey(android.view.View v, int keyCode, android.view.KeyEvent event) {
    if (((event.getAction()) == (android.view.KeyEvent.ACTION_DOWN)) && (keyCode == (android.view.KeyEvent.KEYCODE_ENTER))) {
        if (((editBox.getInputType()) & (android.text.InputType.TYPE_TEXT_FLAG_MULTI_LINE)) != (android.text.InputType.TYPE_TEXT_FLAG_MULTI_LINE)) {
            org.cocos2dx.lib.Cocos2dxEditBoxHelper.closeKeyboardOnUiThread(index);
            org.cocos2dx.lib.Cocos2dxEditBoxHelper.mCocos2dxActivity.getGLSurfaceView().requestFocus();
            return true;
        }
    }
    return false;
}