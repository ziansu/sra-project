@java.lang.Override
public boolean canPullUp() {
    if (((getScrollY()) >= ((getChildAt(0).getHeight()) - (((android.view.View) (getParent().getParent().getParent())).getHeight()))) && ((getChildCount()) >= 10))
        return true;
    else
        return false;
    
}