@android.support.annotation.CallSuper
public void onItemDismiss(int position) {
    if (position != (android.support.v7.widget.RecyclerView.NO_POSITION)) {
        if (((mPendingDeleteItemPosition) == position) && ((mDataChangedObserver) != null)) {
            long mID = getItemId(position);
            mDataChangedObserver.onItemRemoved(mID);
        }
        mItemIDs.remove(position);
        notifyItemRemoved(position);
        (removed)++;
        mPendingDeleteItemPosition = android.support.v7.widget.RecyclerView.NO_POSITION;
    }
}