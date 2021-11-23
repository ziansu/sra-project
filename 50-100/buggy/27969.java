@java.lang.Override
public void onPause() {
    if ((layout) != null) {
        if ((Build.VERSION.SDK_INT) < (Build.VERSION_CODES.JELLY_BEAN)) {
            layout.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }else {
            layout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
        com.dava.engine.DavaActivity.instance().getWindowManager().removeView(layout);
        visibleFrame.setEmpty();
        layout = null;
        contentView = null;
        emitVisibleFrameChanged();
    }
}