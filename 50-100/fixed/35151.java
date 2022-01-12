@java.lang.Override
public int getCount() {
    if ((mCursor) == null) {
        return 0;
    }
    int maxVisible = getContext().getResources().getInteger(R.integer.max_visible_memorials);
    return (mCursor.getCount()) <= maxVisible ? mCursor.getCount() : maxVisible;
}