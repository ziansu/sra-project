@java.lang.Override
public void requestDisallowInterceptTouchEvent(boolean b) {
    if ((((android.os.Build.VERSION.SDK_INT) < 21) && ((mTarget) instanceof android.widget.AbsListView)) || (((mTarget) != null) && (!(android.support.v4.view.ViewCompat.isNestedScrollingEnabled(mTarget))))) {
    }else {
        super.requestDisallowInterceptTouchEvent(b);
    }
}