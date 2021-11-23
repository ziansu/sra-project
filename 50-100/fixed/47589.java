@java.lang.SuppressWarnings(value = "deprecation")
private void swapCursor(android.database.Cursor newCursor) {
    android.util.Log.d(bbct.android.common.activity.BaseballCardList.TAG, "swapCursor()");
    android.database.Cursor oldCursor = this.adapter.getCursor();
    if (oldCursor != null) {
        oldCursor.close();
        this.getActivity().stopManagingCursor(oldCursor);
    }
    if (newCursor != null) {
        this.getActivity().startManagingCursor(newCursor);
        this.adapter.changeCursor(newCursor);
    }
}