@java.lang.Override
public boolean onPreDraw() {
    int peak = 0;
    for (android.view.View view : peakViews) {
        peak += view.getMeasuredHeight();
        peak += view.getPaddingTop();
        peak += view.getPaddingBottom();
    }
    onFirstElementHeight.accept(peak);
    multiView.getViewTreeObserver().removeOnPreDrawListener(this);
    return false;
}