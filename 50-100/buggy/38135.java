@java.lang.Override
public boolean onInterceptTouchEvent(android.view.MotionEvent ev) {
    try {
        boolean intercept = (shouldIntercept) && (dragHelper.shouldInterceptTouchEvent(ev));
        android.util.Log.i(cn.hackill.bong.HomeLayout.TAG, ((((("onInterceptTouchEvent:   intercept = " + intercept) + ", shouldIntercept = ") + (shouldIntercept)) + ", needInter = ") + (needInter)));
        return intercept || (needInter);
    } catch (java.lang.NullPointerException e) {
        e.printStackTrace();
    }
    return false;
}