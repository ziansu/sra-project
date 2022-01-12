@java.lang.Override
public void onSpecialKeyDown(com.facebook.react.views.textinput.ReactTextInputSpecialKey specialKey) {
    if (specialKey != null) {
        mEventDispatcher.dispatchEvent(new com.facebook.react.views.textinput.ReactTextInputSpecialKeyEvent(mReactEditText.getId(), com.facebook.react.common.SystemClock.nanoTime(), specialKey.getKey()));
    }
}