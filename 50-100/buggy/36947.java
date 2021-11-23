@java.lang.Override
public android.os.Parcelable onSaveInstanceState() {
    if (com.mypopsy.widget.SlidingUpPaneLayout.DEBUG)
        android.util.Log.d(com.mypopsy.widget.SlidingUpPaneLayout.TAG, "-----onSaveInstanceState()");
    
    android.os.Parcelable superState = super.onSaveInstanceState();
    com.mypopsy.widget.SlidingUpPaneLayout.SavedState ss = new com.mypopsy.widget.SlidingUpPaneLayout.SavedState(superState);
    if ((mState) != (com.mypopsy.widget.SlidingUpPaneLayout.State.DRAGGING)) {
        ss.state = mState;
    }else {
        ss.state = com.mypopsy.widget.SlidingUpPaneLayout.State.COLLAPSED;
    }
    ss.visibleOffset = mVisibleHeight;
    return ss;
}