@android.support.annotation.CallSuper
public void onItemDismiss(int position) {
    if (position != (android.support.v7.widget.RecyclerView.NO_POSITION)) {
        if (((mPendingDeleteItemPosition) == position) && ((mDataChangedObserver) != null)) {
            long mID = getItemId(position);
            mDataChangedObserver.onItemRemoved(mID);
        }
        mItemIDs.put(getAdapterPosition(position), android.support.v7.widget.RecyclerView.NO_POSITION);
        (removed)++;
        notifyItemRemoved(position);
        mPendingDeleteItemPosition = android.support.v7.widget.RecyclerView.NO_POSITION;
    }
}