private void fireOnItemSelectedEvent(android.view.View v, boolean hasFocus) {
    if (hasFocus) {
        setSelectionOnLayout(getChildLayoutPosition(v));
        smoothScrollToCenter(this, v);
        bringChildToFront(v);
        if ((mOnItemFocusChangeListener) != null) {
            mOnItemFocusChangeListener.onItemSelected(this, v, getChildLayoutPosition(v));
        }
    }else {
        if ((mOnItemFocusChangeListener) != null) {
            mOnItemFocusChangeListener.onItemPreSelected(this, v, getChildLayoutPosition(v));
        }
    }
}