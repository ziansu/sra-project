@java.lang.Override
public void onItemRangeInserted(int positionStart, int itemCount) {
    super.onItemRangeInserted(positionStart, itemCount);
    int messageCount = mFirebaseAdapter.getItemCount();
    int lastVisiblePosition = mLinearLayoutManager.findLastCompletelyVisibleItemPosition();
    if ((lastVisiblePosition == (-1)) || ((positionStart >= (messageCount - 1)) && (lastVisiblePosition == (positionStart - 1)))) {
        mMessageRecyclerView.scrollToPosition(positionStart);
    }
}