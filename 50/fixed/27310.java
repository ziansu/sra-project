@java.lang.Override
public void onGlobalLayout() {
    if (!(done)) {
        doImageAndText(submission, full);
        done = true;
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }else {
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}