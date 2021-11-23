@java.lang.Override
public void onDismissedBySwipeLeft(android.support.v7.widget.RecyclerView recyclerView, int[] reverseSortedPositions) {
    for (int position : reverseSortedPositions) {
        mTripListAdapter.notifyItemRemoved(position);
    }
    mTripListAdapter.notifyDataSetChanged();
}