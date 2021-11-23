@java.lang.Override
public boolean dispatchTouchEvent(android.view.MotionEvent ev) {
    if (!(mFragmentClickable))
        return true;
    
    return super.dispatchTouchEvent(ev);
}