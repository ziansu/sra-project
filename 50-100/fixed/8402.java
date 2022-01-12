public void setDelegate(@android.support.annotation.Nullable
com.nextfaze.poweradapters.PowerAdapter delegate) {
    if (delegate != (mDelegate)) {
        int removeCount = ((mDelegate) != null) ? mDelegate.getItemCount() : 0;
        mDelegate = delegate;
        int insertCount = ((mDelegate) != null) ? mDelegate.getItemCount() : 0;
        updateObservers();
        if (removeCount > 0) {
            notifyItemRangeRemoved(0, removeCount);
        }
        if (insertCount > 0) {
            notifyItemRangeInserted(0, insertCount);
        }
    }
}