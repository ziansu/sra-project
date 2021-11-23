@java.lang.Override
public void onDismissedBySwipeLeft(android.support.v7.widget.RecyclerView recyclerView, int[] reverseSortedPositions) {
    for (int position : reverseSortedPositions) {
        deleteItemFromCloud(position);
        _data.remove(position);
        _rAdapter.notifyItemRemoved(position);
    }
}