@java.lang.Override
public void onFocusChange(android.view.View v, boolean hasFocus) {
    if ((floatingLabelEnabled) && (highlightFloatingLabel)) {
        if (hasFocus) {
            if (getLabelFocusAnimator().isStarted()) {
                getLabelFocusAnimator().reverse();
            }else {
                getLabelFocusAnimator().start();
            }
        }else {
            getLabelFocusAnimator().reverse();
        }
    }
    if ((outerFocusChangeListener) != null) {
        outerFocusChangeListener.onFocusChange(v, hasFocus);
    }
}