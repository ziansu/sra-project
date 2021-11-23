@java.lang.Override
protected void onSizeChanged(int w, int h, int oldw, int oldh) {
    if (!(isEnabled())) {
        return ;
    }
    removeCallbacks(mCheckSizeChanged);
    if (isSoftKeyboardShow()) {
        isEmojiShow = false;
    }
    notifyEmojiLayoutChangeListener(isEmojiShow, isKeyboardShow, (isKeyboardShow ? getSoftKeyboardHeight() : showEmojiHeight));
}