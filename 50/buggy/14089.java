@java.lang.Override
public void onGlobalLayout() {
    content.getViewTreeObserver().removeGlobalOnLayoutListener(this);
    getScreenManager().setCurrentScreen(getScreenBounds(), gameConfig.getDefaultScreen());
}