@java.lang.SuppressWarnings(value = "deprecation")
@java.lang.Override
public void onGlobalLayout() {
    if ((android.os.Build.VERSION.SDK_INT) >= (android.os.Build.VERSION_CODES.JELLY_BEAN)) {
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }else {
        view.getViewTreeObserver().removeGlobalOnLayoutListener(this);
    }
    view.invalidate();
}