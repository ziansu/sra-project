@java.lang.Override
public void onRestoreInstanceState(android.os.Parcelable state) {
    if (com.mypopsy.widget.SlidingUpPaneLayout.DEBUG)
        android.util.Log.d(com.mypopsy.widget.SlidingUpPaneLayout.TAG, "-----onRestoreInstanceState()");
    
    com.mypopsy.widget.SlidingUpPaneLayout.SavedState ss = ((com.mypopsy.widget.SlidingUpPaneLayout.SavedState) (state));
    super.onRestoreInstanceState(ss.getSuperState());
    mState = ((ss.state) != null) ? ss.state : com.mypopsy.widget.SlidingUpPaneLayout.State.COLLAPSED;
    mVisibleHeight = ss.visibleOffset;
}