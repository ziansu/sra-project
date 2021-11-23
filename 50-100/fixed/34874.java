@java.lang.Override
public void setAdapter(android.widget.ListAdapter adapter) {
    if ((mSwipeableView) != null) {
        if (mSwipeStarted) {
            mRestorePosition = mSwipeablePosition;
        }else {
            mSwipeableView.swipeStateReset();
            mSwipeableView = null;
        }
    }
    if ((getAdapter()) != null) {
        getAdapter().unregisterDataSetObserver(mChangeObserver);
    }
    if (adapter != null) {
        adapter.registerDataSetObserver(mChangeObserver);
    }
    super.setAdapter(adapter);
}