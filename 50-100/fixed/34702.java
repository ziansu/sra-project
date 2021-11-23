private void fireOnItemSelectedEvent(android.view.View v, boolean hasFocus) {
    if (hasFocus) {
        smoothScrollToCenter(this, v);
        setSelectionOnLayout(getChildLayoutPosition(v));
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