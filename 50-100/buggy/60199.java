@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    if (v instanceof android.widget.ScrollView) {
        android.widget.ScrollView sv = ((android.widget.ScrollView) (v));
        if (((sv.getScrollY()) == ((sv.getChildAt(0).getMeasuredHeight()) - (sv.getMeasuredHeight()))) && ((mCurrentViewIndex) == 0)) {
            canPullUp = true;
        }else {
            canPullUp = false;
        }
    }else {
        canPullUp = false;
    }
    return false;
}